package com.trabalho.patterns.behavioral.visitor;

import lombok.Getter;

@Getter
public class Livro implements ItemElemento {
    
    private double preco;
    private String isbn;
    private String nome;

    public Livro(double preco, String isbn, String nome) {
        this.preco = preco;
        this.isbn = isbn;
        this.nome = nome;
    }

    // O "pulo do gato" do Visitor (Dupla Distribuição)
    @Override
    public void accept(Visitor visitor) {
        // O elemento "se entrega" ao visitante
        // O Java automaticamente chama o método "visit(Livro livro)"
        visitor.visit(this);
    }
}