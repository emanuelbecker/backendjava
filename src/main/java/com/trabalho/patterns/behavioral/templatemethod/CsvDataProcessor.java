package com.trabalho.patterns.behavioral.templatemethod;

// 3. Subclasse Concreta A
public class CsvDataProcessor extends DataProcessor {

    @Override
    protected void extrairDados() {
        // Usa o método log() da classe pai
        log("Extraindo dados do CSV (lendo linhas e colunas)...<br>");
    }

    @Override
    protected void processarDados() {
        log("Processando dados do CSV (convertendo para objetos)...<br>");
    }
}