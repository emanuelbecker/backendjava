package com.trabalho.patterns.creational.factorymethod;

// 2. Produto Concreto A
public class Caminhao implements Transporte {
    @Override
    public String entregar() {
        return "Entrega por terra (Caminhão).<br>";
    }
}