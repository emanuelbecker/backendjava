package com.trabalho.patterns.structural.bridge;

// 1. A interface de "Implementação" (o baixo nível)
public interface Device {
    boolean isLigado();
    void ligar();
    void desligar();
    int getCanal();
    void setCanal(int canal);
    String getNome();
}