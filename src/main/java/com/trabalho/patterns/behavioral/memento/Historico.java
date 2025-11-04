package com.trabalho.patterns.behavioral.memento;

import java.util.Stack;

// 3. O "Zelador" (Caretaker)
// Ele guarda os Mementos, mas NUNCA olha o conteúdo deles.
public class Historico {

    // Uma pilha é perfeita para "Desfazer" (Undo)
    private Stack<EditorMemento> historico = new Stack<>();
    private Editor editor;

    public Historico(Editor editor) {
        this.editor = editor;
    }

    // O "Zelador" pede ao "Originador" para salvar
    public void salvarSnapshot() {
        System.out.println("LOG MEMENTO: Salvando snapshot...");
        historico.push(editor.salvar());
    }

    // O "Zelador" pega o último snapshot e manda o "Originador" restaurar
    public String desfazer() {
        if (historico.isEmpty()) {
            return "Histórico de 'Desfazer' está vazio.<br>";
        }

        // Pega o último estado salvo
        EditorMemento memento = historico.pop();
        
        // Manda o editor restaurar
        editor.restaurar(memento);
        
        System.out.println("LOG MEMENTO: Restaurando para o estado anterior.");
        return "Desfeito. Conteúdo restaurado para: '" + editor.getConteudo() + "'<br>"; // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
    }
}