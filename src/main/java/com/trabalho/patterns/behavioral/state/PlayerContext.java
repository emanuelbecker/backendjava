package com.trabalho.patterns.behavioral.state;

// 1. O "Contexto" (Context)
// Este é o objeto principal que muda de estado.
public class PlayerContext {
    
    // O Contexto "tem" um estado atual
    private State estadoAtual;
    private StringBuilder log = new StringBuilder();

    public PlayerContext() {
        // O estado inicial
        this.estadoAtual = new EstadoPronto(this);
        log.append("Player inicializado no estado 'Pronto'.<br>");
    }

    // O Contexto usa este método para MUDAR de estado
    public void mudarEstado(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    // O Contexto DELEGA as ações para o estado atual
    public void clicarPlay() {
        // Delega para o estado
        log.append(estadoAtual.clicarPlay());
    }

    public void clicarPause() {
        // Delega para o estado
        log.append(estadoAtual.clicarPause());
    }

    public void clicarStop() {
        // Delega para o estado
        log.append(estadoAtual.clicarStop());
    }
    
    public String getLog() {
        return log.toString();
    }
}