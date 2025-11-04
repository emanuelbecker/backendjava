package com.trabalho.patterns.structural.proxy;

// 2. O "Objeto Real" (RealSubject)
// Este é o objeto "caro" ou "pesado"
public class ImagemReal implements Imagem {

    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        // Simula a operação "cara" de carregar do disco
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("LOG DO PROXY: [OPERAÇÃO CARA] Carregando '" + nomeArquivo + "' do disco...");
        // Simula um delay
        try {
            Thread.sleep(1000); // 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String exibir() {
        return "Exibindo '" + nomeArquivo + "' (Objeto Real)<br>";
    }

    @Override
    public String getNomeArquivo() {
        return nomeArquivo;
    }
}