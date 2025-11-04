package com.trabalho.patterns.behavioral.chainofresponsibility;

// 2. Handler Concreto 1
public class AssistenteAprovador extends Aprovador {
    
    private static final double LIMITE_APROVACAO = 100.0;

    @Override
    public String processarRequisicao(RequisicaoCompra requisicao) {
        if (requisicao.getValor() <= LIMITE_APROVACAO) {
            // Este elo pode processar
            requisicao.aprovar("Assistente");
            return "Assistente aprovou a requisição de R$ " + requisicao.getValor() + "<br>";
        } else {
            // Não pode processar? Passa para o próximo da cadeia.
            return "[Assistente passou] -> " + super.passarParaOProximo(requisicao);
        }
    }
}