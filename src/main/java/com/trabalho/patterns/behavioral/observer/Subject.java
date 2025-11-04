package com.trabalho.patterns.behavioral.observer;

// 2. A interface "Subject" (ou Publicador)
public interface Subject {
    void adicionarInscrito(Observer observer);
    void removerInscrito(Observer observer);
    void notificarInscritos(String nomeProduto);
}