package com.trabalho.patterns.behavioral.chainofresponsibility;

// 1. O "Handler" Abstrato
public abstract class Aprovador {
    
    // Cada elo da cadeia "tem" uma referência para o próximo
    protected Aprovador proximoAprovador;

    // Método para definir o próximo (construir a cadeia)
    public Aprovador setProximo(Aprovador proximo) {
        this.proximoAprovador = proximo;
        return proximo; // Facilita o encadeamento: a.setProximo(b.setProximo(c))
    }

    // O método de processamento principal
    public abstract String processarRequisicao(RequisicaoCompra requisicao);
    
    // Método helper para passar para o próximo
    protected String passarParaOProximo(RequisicaoCompra requisicao) {
        if (proximoAprovador != null) {
            return proximoAprovador.processarRequisicao(requisicao);
        } else {
            // Fim da cadeia
            return "Requisição de R$ " + requisicao.getValor() + " não pôde ser aprovada por ninguém.<br>";
        }
    }
}