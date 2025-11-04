package com.trabalho.patterns.behavioral.visitor;

import lombok.Getter;

@Getter
public class Dvd implements ItemElemento {

    private double preco;
    private String titulo;

    public Dvd(double preco, String titulo) {
        this.preco = preco;
        this.titulo = titulo;
    }

    @Override
    public void accept(Visitor visitor) {
        // O Java automaticamente chama o método "visit(Dvd dvd)"
        visitor.visit(this);
    }
}