package com.trabalho.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Retangulo extends Forma {
    
    private int largura;
    private int altura;

    public Retangulo() {}

    // Construtor de cópia
    public Retangulo(Retangulo alvo) {
        super(alvo);
        if (alvo != null) {
            this.largura = alvo.largura;
            this.altura = alvo.altura;
        }
    }

    @Override
    public Forma clonar() {
        return new Retangulo(this);
    }
    
    // (Pulei o .equals() e .toString() para simplificar)
}