package com.trabalho.patterns.creational.builder;

// A implementação concreta do Builder
public class CarroBuilder implements VeiculoBuilder {

    // O Builder "guarda" as peças enquanto constrói
    private String motor;
    private int assentos;
    private boolean temGPS;
    private String cor;

    public CarroBuilder() {
        this.resetar();
    }

    @Override
    public void resetar() {
        // Define valores padrão para um "Carro"
        this.motor = "1.0 Flex";
        this.assentos = 5;
        this.temGPS = false;
        this.cor = "Branco";
    }

    @Override
    public void construirMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void definirAssentos(int numero) {
        this.assentos = numero;
    }

    @Override
    public void adicionarGPS(boolean temGPS) {
        this.temGPS = temGPS;
    }

    @Override
    public void pintar(String cor) {
        this.cor = cor;
    }

    @Override
    public Veiculo getResultado() {
        // Cria o Veiculo com as peças atuais
        Veiculo carro = new Veiculo("Carro", this.motor, this.assentos, this.temGPS, this.cor);
        // Reseta o builder para a próxima construção
        this.resetar();
        return carro;
    }
}