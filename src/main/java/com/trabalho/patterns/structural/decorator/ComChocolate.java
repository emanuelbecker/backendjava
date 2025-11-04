package com.trabalho.patterns.structural.decorator;

// 5. Outro "Decorator Concreto"
public class ComChocolate extends CafeDecorator {

    public ComChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco() {
        // Preço do café embrulhado + custo do chocolate
        return super.getPreco() + 3.5;
    }

    @Override
    public String getDescricao() {
        // Descrição do café embrulhado + descrição do chocolate
        return super.getDescricao() + ", com chocolate";
    }
}