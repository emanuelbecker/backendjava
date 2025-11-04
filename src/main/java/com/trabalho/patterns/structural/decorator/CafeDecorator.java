package com.trabalho.patterns.structural.decorator;

// 3. O "Decorator Abstrato"
// Ele implementa a interface do Componente
public abstract class CafeDecorator implements Cafe {

    // O Decorator "tem" (embrulha) outro Café
    protected Cafe cafeEmbrulhado;

    public CafeDecorator(Cafe cafe) {
        this.cafeEmbrulhado = cafe;
    }

    // Por padrão, o decorator delega a chamada para o objeto embrulhado
    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco();
    }

    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao();
    }
}