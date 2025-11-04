package com.trabalho.patterns.behavioral.templatemethod;

// 1. A Classe Abstrata
public abstract class DataProcessor {

    private StringBuilder log = new StringBuilder();

    // 2. Este é o "TEMPLATE METHOD"
    // Ele é 'final' para que as subclasses não possam sobrescrevê-lo.
    // Ele define o "esqueleto" do algoritmo.
    public final String processar(String nomeArquivo) {
        log.setLength(0); // Limpa o log
        
        abrirArquivo(nomeArquivo); // Passo 1 (concreto)
        extrairDados();          // Passo 2 (abstrato - a ser implementado)
        processarDados();        // Passo 3 (abstrato - a ser implementado)
        fecharArquivo();         // Passo 4 (concreto)
        
        return log.toString();
    }

    // --- Passos Concretos (comuns a todos) ---
    private void abrirArquivo(String nomeArquivo) {
        log.append("Abrindo arquivo: " + nomeArquivo + "<br>");
    }

    private void fecharArquivo() {
        log.append("Fechando arquivo.<br>");
    }

    // --- Passos Abstratos (ou "Hooks") ---
    // Estes métodos DEvem ser implementados pelas subclasses
    
    protected abstract void extrairDados();
    
    protected abstract void processarDados();
    
    // Método auxiliar para o log
    protected void log(String msg) {
        log.append(msg);
    }
}