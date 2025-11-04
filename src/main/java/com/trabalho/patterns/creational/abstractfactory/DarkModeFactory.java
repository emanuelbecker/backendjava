package com.trabalho.patterns.creational.abstractfactory;

// 9. Fábrica Concreta 2 (SÓ cria produtos da família "Dark")
public class DarkModeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}