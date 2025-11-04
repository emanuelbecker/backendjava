package com.trabalho.patterns.behavioral.chainofresponsibility;

// 4. Handler Concreto 3 (Fim da cadeia)
public class DiretorAprovador extends Aprovador {
    
    // O diretor pode aprovar qualquer coisa
    @Override
    public String processarRequisicao(RequisicaoCompra requisicao) {
        // O diretor é o último, ele aprova
        requisicao.aprovar("Diretor");
        return "Diretor aprovou a requisição de R$ " + requisicao.getValor() + "<br>";
    }
    
    // (Não precisamos do "passarParaOProximo" aqui, pois ele é o último elo)
}