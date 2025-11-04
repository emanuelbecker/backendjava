package com.trabalho.patterns.structural.proxy;

// 3. O "Proxy"
// Ele implementa a mesma interface do Objeto Real
public class ProxyImagem implements Imagem {

    // O Proxy "sabe" o nome do arquivo, mas não o carrega
    private String nomeArquivo;
    
    // O Proxy "tem" uma referência para o Objeto Real,
    // mas ela começa NULA (isso é o Lazy Loading)
    private ImagemReal imagemReal;

    public ProxyImagem(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    // O método de controle!
    @Override
    public String exibir() {
        // Na primeira vez que "exibir()" é chamado, o objeto real é nulo.
        if (imagemReal == null) {
            // O Proxy cria (e carrega) o objeto real "pesado"
            imagemReal = new ImagemReal(nomeArquivo);
        }
        
        // Em todas as chamadas (a primeira ou as seguintes),
        // ele delega a chamada para o objeto real já carregado.
        return imagemReal.exibir();
    }

    @Override
    public String getNomeArquivo() {
        // Pode retornar o nome sem carregar o objeto real
        return nomeArquivo + " (Proxy)";
    }
}