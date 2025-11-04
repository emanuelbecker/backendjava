package com.trabalho.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// 3. O "Mediador Concreto"
public class ChatRoom implements ChatMediator {

    // O Mediador "conhece" todos os colegas
    private List<User> usuarios;
    private StringBuilder logDaSala; // Para o nosso teste

    public ChatRoom() {
        this.usuarios = new ArrayList<>();
        this.logDaSala = new StringBuilder();
    }

    @Override
    public void adicionarUser(User user) {
        this.usuarios.add(user);
    }

    // Este é o coração do Mediador
    @Override
    public void enviarMensagem(String mensagem, User remetente) {
        logDaSala.append("<b>--- " + remetente.getNome() + " enviou: '" + mensagem + "' ---</b><br>");
        
        // O Mediador repassa a mensagem para TODOS os outros usuários
        for (User user : usuarios) {
            // ... exceto para quem enviou a mensagem
            if (user != remetente) {
                logDaSala.append(user.receber(mensagem, remetente.getNome()));
            }
        }
        logDaSala.append("<br>");
    }
    
    public String getLog() {
        return logDaSala.toString();
    }
}