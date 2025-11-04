package com.trabalho.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// 4. O "Subject Concreto"
public class Loja implements Subject {

    // A lista de inscritos
    private List<Observer> clientesInscritos = new ArrayList<>();
    
    private String ultimoProduto; // O "estado"

    @Override
    public void adicionarInscrito(Observer observer) {
        clientesInscritos.add(observer);
    }

    @Override
    public void removerInscrito(Observer observer) {
        clientesInscritos.remove(observer);
    }

    // O método que dispara a notificação
    @Override
    public void notificarInscritos(String nomeProduto) {
        System.out.println("LOG OBSERVER: Notificando " + clientesInscritos.size() + " inscritos...");
        // Chama o método "notificar" de CADA inscrito
        for (Observer observer : clientesInscritos) {
            observer.notificar(nomeProduto);
        }
    }

    // Este é o método de negócio que muda o estado e dispara o padrão
    public void novoProdutoChegou(String nomeProduto) {
        this.ultimoProduto = nomeProduto;
        
        // Ao mudar o estado, ele notifica todo mundo!
        notificarInscritos(nomeProduto);
    }
}