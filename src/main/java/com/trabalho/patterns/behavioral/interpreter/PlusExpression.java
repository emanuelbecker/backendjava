package com.trabalho.patterns.behavioral.interpreter;

// 3. A "Expressão Não-Terminal"
// Ela "tem" outras expressões (esquerda e direita)
public class PlusExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public PlusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        // A interpretação é a SOMA da interpretação dos seus filhos.
        return leftExpression.interpret() + rightExpression.interpret();
    }
}