package com.trabalho.patterns.structural.bridge;

public class Tv implements Device {
    private boolean ligado = false;
    private int canal = 10;

    @Override
    public boolean isLigado() { return ligado; }
    @Override
    public void ligar() { this.ligado = true; }
    @Override
    public void desligar() { this.ligado = false; }
    @Override
    public int getCanal() { return canal; }
    @Override
    public void setCanal(int canal) { this.canal = canal; }
    @Override
    public String getNome() { return "TV"; }
}