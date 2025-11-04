package com.trabalho.patterns.behavioral.strategy;

// 2. Implementação Concreta B
public class PagamentoPix implements PagamentoStrategy {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String pagar(double valor) {
        // Lógica de pagamento com Pix...
        return "Pagamento de R$ " + valor + " realizado com Chave Pix " + chavePix;
    }
}