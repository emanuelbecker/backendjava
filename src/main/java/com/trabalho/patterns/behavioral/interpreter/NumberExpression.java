package com.trabalho.patterns.behavioral.interpreter;

// 2. A "Expressão Terminal"
// É um "nó-folha" na árvore da gramática. Não tem outras expressões.
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        // A interpretação de um número é ele mesmo.
        return number;
    }
}