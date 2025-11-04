package com.trabalho.patterns.structural.decorator;

// 4. Um "Decorator Concreto"
public class ComLeite extends CafeDecorator {

    public ComLeite(Cafe cafe) {
        // Passa o café para o construtor pai (CafeDecorator)
        super(cafe);
    }

    // Ele sobrescreve os métodos para adicionar seu próprio comportamento
    @Override
    public double getPreco() {
        // Preço do café embrulhado + custo do leite
        return super.getPreco() + 2.0;
    }

    @Override
    public String getDescricao() {
        // Descrição do café embrulhado + descrição do leite
        return super.getDescricao() + ", com leite";
    }
}