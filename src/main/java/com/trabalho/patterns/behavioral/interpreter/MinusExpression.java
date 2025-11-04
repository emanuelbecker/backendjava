package com.trabalho.patterns.behavioral.interpreter;

// 4. Outra "Expressão Não-Terminal"
public class MinusExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public MinusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        // A interpretação é a SUBTRAÇÃO da interpretação dos seus filhos.
        return leftExpression.interpret() - rightExpression.interpret();
    }
}