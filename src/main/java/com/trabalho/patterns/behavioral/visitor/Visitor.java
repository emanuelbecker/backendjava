package com.trabalho.patterns.behavioral.visitor;

// 1. A interface "Visitor"
// Ela deve ter um método "visit" para CADA classe de "Elemento"
public interface Visitor {
    void visit(Livro livro);
    void visit(Dvd dvd);
}