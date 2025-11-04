package com.trabalho.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter // <-- ADICIONE ISSO
@Setter // <-- ADICIONE ISSO
public abstract class Forma {
    
    // Atributos comuns a todas as formas
    private int x;
    private int y;
    private String cor;

    // Construtor padrão
    public Forma() {}

    // Construtor de cópia (para o clone)
    protected Forma(Forma alvo) {
        if (alvo != null) {
            this.x = alvo.x;
            this.y = alvo.y;
            this.cor = alvo.cor;
        }
    }

    // O método "Prototype"
    public abstract Forma clonar();

    // Sobrescrevendo o 'equals' para ajudar no teste
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Forma)) return false;
        Forma outraForma = (Forma) obj;
        return outraForma.x == x && outraForma.y == y && outraForma.cor.equals(cor);
    }
    
}