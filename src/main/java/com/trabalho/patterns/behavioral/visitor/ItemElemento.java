package com.trabalho.patterns.behavioral.visitor;

// 2. A interface "Elemento"
public interface ItemElemento {
    // O método "accept" é a porta de entrada para o visitante
    void accept(Visitor visitor);
}