package com.trabalho.patterns.structural.flyweight;

// 1. O Objeto Flyweight
// Contém o estado "Intrínseco" (compartilhado)
public class TipoCaractere {
    
    private final char simbolo;
    private final String fonte;
    private final int tamanho;
    // (Imagine mais 100kb de dados de textura/renderização aqui)

    public TipoCaractere(char simbolo, String fonte, int tamanho) {
        this.simbolo = simbolo;
        this.fonte = fonte;
        this.tamanho = tamanho;
    }

    // O método de "operação" que usa o estado "Extrínseco" (único)
    public String renderizar(int posicaoX, int posicaoY) {
        return "Renderizando '" + simbolo + "' (Fonte: " + fonte + ", Tamanho: " + tamanho + ") na posição (" + posicaoX + ", " + posicaoY + ")<br>";
    }
}