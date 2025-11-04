package com.trabalho.patterns.creational.factorymethod;

// 4. A Superclasse "Creator" (Abstrata)
public abstract class Logistica {

    // ***** ESTE É O "FACTORY METHOD" *****
    // É um método abstrato que "fabrica" o produto.
    public abstract Transporte criarTransporte();

    // A superclasse pode ter lógica de negócio que USA o produto,
    // sem saber qual produto concreto é.
    public String planejarEntrega() {
        // 1. Chama o "Factory Method" para obter o objeto
        Transporte t = criarTransporte();
        
        // 2. Usa o objeto
        String log = "Planejamento de entrega:<br>";
        log += t.entregar();
        return log;
    }
}