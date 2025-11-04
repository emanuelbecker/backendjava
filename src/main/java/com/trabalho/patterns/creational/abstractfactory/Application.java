package com.trabalho.patterns.creational.abstractfactory;

// 10. O "Cliente"
// A Aplicação não sabe qual TEMA (fábrica) está usando,
// ela só sabe que precisa de um botão e uma caixa de texto.
public class Application {
    
    private GUIFactory factory;
    private Button button;
    private TextBox textBox;

    // A aplicação é INJETADA com a fábrica que deve usar
    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    // Cria a UI usando a fábrica
    public void criarUI() {
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    // Renderiza a UI
    public String renderizar() {
        if(button == null || textBox == null) {
            criarUI();
        }
        return button.render() + "<br>" + textBox.render();
    }
}