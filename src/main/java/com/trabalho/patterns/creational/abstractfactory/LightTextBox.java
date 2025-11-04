package com.trabalho.patterns.creational.abstractfactory;

// 4. Produto Concreto B1 (Família "Light")
public class LightTextBox implements TextBox {
    @Override
    public String render() {
        return "Renderizando [Caixa de Texto Clara]";
    }
}