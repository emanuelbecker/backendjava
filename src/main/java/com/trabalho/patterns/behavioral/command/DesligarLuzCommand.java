package com.trabalho.patterns.behavioral.command;

// 4. O "Comando Concreto" B
public class DesligarLuzCommand implements Command {
    
    private Luz luz;

    public DesligarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public String executar() {
        // Delega a ação para o receptor
        return luz.desligar();
    }
}