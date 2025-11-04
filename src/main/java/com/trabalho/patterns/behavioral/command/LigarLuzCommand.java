package com.trabalho.patterns.behavioral.command;

// 3. O "Comando Concreto" A
public class LigarLuzCommand implements Command {
    
    // O comando "tem" o receptor que ele vai controlar
    private Luz luz;

    public LigarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public String executar() {
        // O comando delega a ação para o receptor
        return luz.ligar();
    }
}