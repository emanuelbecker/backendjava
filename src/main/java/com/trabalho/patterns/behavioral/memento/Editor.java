package com.trabalho.patterns.behavioral.memento;

import lombok.Getter;

// 2. O "Originador" (Originator)
// O objeto que possui o estado interno que queremos salvar.
public class Editor {
    
    @Getter // Lombok para criar o getConteudo()
    private String conteudo; // O estado interno

    public Editor() {
        this.conteudo = "";
    }
    
    // Altera o estado interno
    public void digitar(String texto) {
        this.conteudo += texto;
    }

    // --- Métodos do Padrão Memento ---

    /**
     * Cria um "Snapshot" (Memento) do seu estado atual.
     */
    public EditorMemento salvar() {
        // Cria um novo Memento com o estado atual
        return new EditorMemento(this.conteudo);
    }

    /**
     * Restaura seu estado a partir de um "Snapshot" (Memento).
     */
    public void restaurar(EditorMemento memento) {
        // Pega o estado salvo no Memento e restaura
        this.conteudo = memento.getConteudoSalvo();
    }
}