package com.trabalho.patterns.behavioral.templatemethod;

// 4. Subclasse Concreta B
public class JsonDataProcessor extends DataProcessor {

    @Override
    protected void extrairDados() {
        log("Extraindo dados do JSON (parsing da árvore JSON)...<br>");
    }

    @Override
    protected void processarDados() {
        log("Processando dados do JSON (mapeando para objetos)...<br>");
    }
}