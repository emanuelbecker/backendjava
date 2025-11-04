package com.trabalho.patterns.creational.builder;

// O Diretor sabe as "receitas"
public class Diretor {
    
    private VeiculoBuilder builder;

    public Diretor(VeiculoBuilder builder) {
        this.builder = builder;
    }

    // Receita 1: "Construir um Carro Esportivo"
    public Veiculo construirCarroEsportivo() {
        builder.resetar(); // Começa do zero
        builder.construirMotor("V8 Biturbo");
        builder.definirAssentos(2);
        builder.adicionarGPS(true);
        builder.pintar("Vermelho Ferrari");
        return builder.getResultado();
    }

    // Receita 2: "Construir um Carro Popular (Padrão)"
    public Veiculo construirCarroPopular() {
        builder.resetar(); // O reset já define os padrões (1.0, 5 assentos, etc)
        // Não precisamos fazer mais nada
        return builder.getResultado();
    }
}