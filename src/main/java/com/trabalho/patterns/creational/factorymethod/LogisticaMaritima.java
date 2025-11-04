package com.trabalho.patterns.creational.factorymethod;

// 6. "Creator" Concreto B
public class LogisticaMaritima extends Logistica {

    // A subclasse implementa o "Factory Method"
    @Override
    public Transporte criarTransporte() {
        // Retorna o produto Navio
        return new Navio();
    }
}