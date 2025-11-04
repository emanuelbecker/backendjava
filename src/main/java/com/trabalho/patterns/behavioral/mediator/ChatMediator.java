package com.trabalho.patterns.behavioral.mediator;

// 1. A interface "Mediator"
public interface ChatMediator {
    
    // O Mediador sabe como enviar a mensagem
    void enviarMensagem(String mensagem, User remetente);

    // O Mediador sabe como adicionar usuários
    void adicionarUser(User user);
}