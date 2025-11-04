package com.trabalho.patterns.behavioral.strategy;

import lombok.Setter;

// 3. O Contexto que USA a estratégia
public class CarrinhoDeCompras {
    
    @Setter
    private double valorTotal;
    
    // O Contexto "tem" uma estratégia, mas não sabe qual é
    @Setter
    private PagamentoStrategy estrategiaDePagamento;

    public String finalizarCompra() {
        if (estrategiaDePagamento == null) {
            return "Erro: Nenhuma forma de pagamento selecionada.";
        }
        // Delega a ação para a estratégia selecionada
        return estrategiaDePagamento.pagar(valorTotal);
    }

}