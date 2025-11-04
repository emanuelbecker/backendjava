package com.trabalho.patterns.behavioral.chainofresponsibility;

// 3. Handler Concreto 2
public class GerenteAprovador extends Aprovador {
    
    private static final double LIMITE_APROVACAO = 1000.0;

    @Override
    public String processarRequisicao(RequisicaoCompra requisicao) {
        if (requisicao.getValor() <= LIMITE_APROVACAO) {
            // Este elo pode processar
            requisicao.aprovar("Gerente");
            return "Gerente aprovou a requisição de R$ " + requisicao.getValor() + "<br>";
        } else {
            // Passa para o próximo
            return "[Gerente passou] -> " + super.passarParaOProximo(requisicao);
        }
    }
}