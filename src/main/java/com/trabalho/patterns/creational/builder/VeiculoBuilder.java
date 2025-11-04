package com.trabalho.patterns.creational.builder;

// A interface do Builder
public interface VeiculoBuilder {
    
    // Métodos "step-by-step"
    void resetar();
    void construirMotor(String motor);
    void definirAssentos(int numero);
    void adicionarGPS(boolean temGPS);
    void pintar(String cor);

    // O método final que retorna o objeto construído
    Veiculo getResultado();
}