package com.trabalho.patterns.behavioral.interpreter;

// 1. A "Expressão Abstrata"
// Define a interface para todas as partes da gramática.
public interface Expression {
    int interpret();
}