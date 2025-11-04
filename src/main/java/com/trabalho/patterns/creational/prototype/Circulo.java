package com.trabalho.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter // <-- ADICIONE ISSO
@Setter // <-- ADICIONE ISSO
public class Circulo extends Forma {
    
    private int raio;

    public Circulo() {}

    // Construtor de cópia
    public Circulo(Circulo alvo) {
        super(alvo);
        if (alvo != null) {
            this.raio = alvo.raio;
        }
    }

    // Implementação do método de clonagem
    @Override
    public Forma clonar() {
        return new Circulo(this);
    }

    // Sobrescrevendo o 'equals'
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circulo) || !super.equals(obj)) return false;
        Circulo outroCirculo = (Circulo) obj;
        return outroCirculo.raio == this.raio;
    }
    
    @Override
    public String toString() {
        // Esses erros vermelhos vão sumir no Passo 3
        return "Circulo [raio=" + raio + ", x=" + getX() + ", y=" + getY() + ", cor=" + getCor() + "]";
    }
    
}