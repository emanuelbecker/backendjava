package com.trabalho.patterns.structural.facade;

public class LuzesAmbiente {
    public String diminuir(int nivel) { return "Luzes diminuídas para " + nivel + "%"; }
    public String acender() { return "Luzes acesas"; }
}