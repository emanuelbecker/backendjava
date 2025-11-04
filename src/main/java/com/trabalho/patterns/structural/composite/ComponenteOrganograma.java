package com.trabalho.patterns.structural.composite;

// 1. A interface "Componente"
// Define a operação comum para ambos os objetos simples (folhas) e compostos.
public interface ComponenteOrganograma {
    
    // Método comum
    String exibirDetalhes();
    
    // Métodos para gerenciar filhos (usados pelo Composite, ignorados pela Folha)
    default void adicionar(ComponenteOrganograma componente) {
        // Por padrão, não faz nada
    }
    
    default void remover(ComponenteOrganograma componente) {
        // Por padrão, não faz nada
    }
}