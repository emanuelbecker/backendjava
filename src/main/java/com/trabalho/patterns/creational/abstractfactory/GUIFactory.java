package com.trabalho.patterns.creational.abstractfactory;

// 7. A "Fábrica Abstrata" (A interface da fábrica)
// Ela define métodos para criar TODOS os produtos da família
public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}