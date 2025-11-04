package com.trabalho.patterns.structural.proxy;

// 1. A interface "Assunto" (Subject)
// Define o que o Proxy e o Objeto Real podem fazer.
public interface Imagem {
    String exibir();
    String getNomeArquivo();
}