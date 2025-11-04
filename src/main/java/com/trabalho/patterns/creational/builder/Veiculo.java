package com.trabalho.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString // O Lombok cria um método .toString() para nós (ótimo para debug)
public class Veiculo {
    
    // Muitos atributos = objeto complexo
    private final String tipo;      // Carro, Moto, Caminhão
    private final String motor;     // 1.0, V8, Elétrico
    private final int assentos;
    private final boolean temGPS;
    private final String cor;

    // O construtor é protegido (ou privado) para forçar o uso do Builder
    protected Veiculo(String tipo, String motor, int assentos, boolean temGPS, String cor) {
        this.tipo = tipo;
        this.motor = motor;
        this.assentos = assentos;
        this.temGPS = temGPS;
        this.cor = cor;
    }
}