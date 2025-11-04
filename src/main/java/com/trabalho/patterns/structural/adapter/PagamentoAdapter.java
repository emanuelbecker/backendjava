package com.trabalho.patterns.structural.adapter;

// 3. O ADAPTADOR
// Ele IMPLEMENTA a interface do nosso sistema (PagamentoProvider)
// E "envolve" (HAS-A) a classe incompatível (ProvedorNovoPagamento)
public class PagamentoAdapter implements PagamentoProvider {

    private ProvedorNovoPagamento apiNova;

    public PagamentoAdapter(ProvedorNovoPagamento apiNova) {
        this.apiNova = apiNova;
    }

    @Override
    public String processarPagamento(double valor) {
        // Aqui acontece a "tradução" (adaptação)
        // Nosso sistema usa 'double' (ex: 100.50)
        // A API nova usa 'int' em centavos (ex: 10050)
        int valorCentavos = (int) (valor * 100);
        
        // Chama o método da API nova, traduzindo a chamada
        return apiNova.executarCobrancaEmCentavos(valorCentavos);
    }
}