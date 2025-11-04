package com.trabalho.patterns.behavioral.command;

// 1. O "Receptor" (Receiver)
// O objeto que sabe como executar a operação real.
public class Luz {
    private String local;
    private boolean ligada = false;

    public Luz(String local) {
        this.local = local;
    }

    public String ligar() {
        if (!ligada) {
            this.ligada = true;
            return "Luz da " + local + " ACESA<br>";
        }
        return "Luz da " + local + " já estava acesa.<br>";
    }

    public String desligar() {
        if (ligada) {
            this.ligada = false;
            return "Luz da " + local + " APAGADA<br>";
        }
        return "Luz da " + local + " já estava apagada.<br>";
    }
}