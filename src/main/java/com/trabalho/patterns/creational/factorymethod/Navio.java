package com.trabalho.patterns.creational.factorymethod;

// 3. Produto Concreto B
public class Navio implements Transporte {
    @Override
    public String entregar() {
        return "Entrega por mar (Navio).<br>";
    }
}