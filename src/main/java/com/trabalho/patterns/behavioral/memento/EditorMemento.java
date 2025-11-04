package com.trabalho.patterns.behavioral.memento;

// 1. O "Memento"
// É um objeto simples (geralmente imutável) que guarda o "estado"
// Apenas o Originador (Editor) deve saber o que há aqui dentro.
public class EditorMemento {
    
    // O estado que queremos salvar
    private final String conteudo;

    public EditorMemento(String conteudo) {
        this.conteudo = conteudo;
    }

    // O método "getter" que SÓ o Originador deve chamar
    protected String getConteudoSalvo() {
        return conteudo;
    }
}