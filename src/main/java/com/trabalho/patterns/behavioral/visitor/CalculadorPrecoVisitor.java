package com.trabalho.patterns.behavioral.visitor;

// 3. "Visitante Concreto" A - Operação de Calcular Preço
public class CalculadorPrecoVisitor implements Visitor {
    
    private double precoTotal = 0;

    @Override
    public void visit(Livro livro) {
        // Lógica de preço para livro (ex: 10% de desconto)
        precoTotal += livro.getPreco() * 0.9;
    }

    @Override
    public void visit(Dvd dvd) {
        // Lógica de preço para DVD (ex: preço cheio)
        precoTotal += dvd.getPreco();
    }
    
    public double getPrecoTotal() {
        return precoTotal;
    }
}