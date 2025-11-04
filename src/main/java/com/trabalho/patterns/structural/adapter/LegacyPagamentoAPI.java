package com.trabalho.patterns.structural.adapter;

// Exemplo de uma classe que já funciona com nossa interface
public class LegacyPagamentoAPI implements PagamentoProvider {
    @Override
    public String processarPagamento(double valor) {
        return "Pagamento de R$ " + valor + " processado pela API Legada.";
    }
}