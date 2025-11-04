package com.trabalho.patterns.creational.abstractfactory;

// 8. Fábrica Concreta 1 (SÓ cria produtos da família "Light")
public class LightModeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightTextBox();
    }
}