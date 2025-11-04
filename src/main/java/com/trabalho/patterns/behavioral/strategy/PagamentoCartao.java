package com.trabalho.patterns.behavioral.strategy;

// 2. Implementação Concreta A
public class PagamentoCartao implements PagamentoStrategy {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String pagar(double valor) {
        // Lógica de pagamento com cartão...
        return "Pagamento de R$ " + valor + " realizado com Cartão final " + numeroCartao.substring(0, 4);
    }
}