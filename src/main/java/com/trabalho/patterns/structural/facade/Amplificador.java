package com.trabalho.patterns.structural.facade;

public class Amplificador {
    public String ligar() { return "Amplificador ligado"; }
    public String desligar() { return "Amplificador desligado"; }
    public String setVolume(int nivel) { return "Volume do amplificador em " + nivel; }
}