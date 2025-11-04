package com.trabalho.patterns.behavioral.observer;

// 3. O "Observer Concreto"
public class Cliente implements Observer {
    
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    // A ação que o Observer toma quando é notificado
    @Override
    public String notificar(String nomeProduto) {
        String log = "<b>[" + this.nome + "]:</b> 'Opa! O produto '" + nomeProduto + "' chegou na loja! Estou indo comprar!'<br>";
        System.out.println("LOG OBSERVER: " + log);
        return log;
    }
}