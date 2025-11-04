package com.trabalho.patterns.behavioral.command;

// 5. O "Invocador" (Invoker)
// Este é o "botão" do nosso controle.
public class ControleRemotoSimples {
    
    // O invocador "tem" um slot para um comando.
    // Ele não sabe o que o comando faz, apenas que pode 'executar()'.
    private Command slot;

    public ControleRemotoSimples() {}

    // Método para "programar" o botão
    public void setComando(Command comando) {
        this.slot = comando;
    }

    // Método para "apertar o botão"
    public String apertarBotao() {
        if (slot != null) {
            return slot.executar();
        }
        return "Botão não programado.<br>";
    }
}