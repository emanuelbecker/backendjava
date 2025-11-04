package com.trabalho.patterns.creational.abstractfactory;

// 3. Produto Concreto A1 (Família "Light")
public class LightButton implements Button {
    @Override
    public String render() {
        return "Renderizando [Botão Claro]";
    }
}