package com.trabalho.patterns.structural.decorator;

// 2. O "Componente Concreto" (o objeto base)
public class CafeSimples implements Cafe {
    @Override
    public double getPreco() {
        return 5.0; // Preço base do café
    }

    @Override
    public String getDescricao() {
        return "Café simples";
    }
}