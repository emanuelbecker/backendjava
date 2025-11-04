package com.trabalho.patterns.creational.factorymethod;

// 5. "Creator" Concreto A
// Esta subclasse decide qual produto concreto criar
public class LogisticaTerrestre extends Logistica {

    // A subclasse implementa o "Factory Method"
    @Override
    public Transporte criarTransporte() {
        // Retorna o produto Caminhão
        return new Caminhao();
    }
}