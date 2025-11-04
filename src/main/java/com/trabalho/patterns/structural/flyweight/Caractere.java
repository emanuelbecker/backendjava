package com.trabalho.patterns.structural.flyweight;

// 3. O "Contexto" ou Objeto Cliente
// Ele contém o estado "Extrínseco" (único)
public class Caractere {
    
    // Estado Extrínseco (único para cada caractere)
    private final int posicaoX;
    private final int posicaoY;
    
    // Referência para o objeto Flyweight compartilhado
    private final TipoCaractere tipo;

    public Caractere(char simbolo, int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        // Pede o Flyweight para a fábrica
        this.tipo = FabricaTipoCaractere.getTipoCaractere(simbolo);
    }

    public String renderizar() {
        // Delega a renderização para o Flyweight, passando o estado extrínseco
        return tipo.renderizar(posicaoX, posicaoY);
    }
    
    // Método para ajudar no teste
    public TipoCaractere getTipo() {
        return tipo;
    }
}