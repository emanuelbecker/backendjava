package com.trabalho.patterns.creational.abstractfactory;

// 6. Produto Concreto B2 (Família "Dark")
public class DarkTextBox implements TextBox {
    @Override
    public String render() {
        return "Renderizando (Caixa de Texto Escura)";
    }
}