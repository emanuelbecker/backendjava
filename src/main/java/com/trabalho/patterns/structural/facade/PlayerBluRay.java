package com.trabalho.patterns.structural.facade;

public class PlayerBluRay {
    public String ligar() { return "Blu-ray ligado"; }
    public String desligar() { return "Blu-ray desligado"; }
    public String play(String filme) { return "Iniciando filme: " + filme; }
}