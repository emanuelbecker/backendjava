package com.trabalho.patterns.creational.abstractfactory;

// 5. Produto Concreto A2 (Família "Dark")
public class DarkButton implements Button {
    @Override
    public String render() {
        return "Renderizando (Botão Escuro)";
    }
}