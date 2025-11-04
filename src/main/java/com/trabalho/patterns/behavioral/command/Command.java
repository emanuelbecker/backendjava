package com.trabalho.patterns.behavioral.command;

// 2. A interface "Command"
public interface Command {
    String executar();
    // Poderíamos adicionar um 'desfazer()' aqui para implementar o Undo
}