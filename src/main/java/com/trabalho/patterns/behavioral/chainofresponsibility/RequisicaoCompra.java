package com.trabalho.patterns.behavioral.chainofresponsibility;

// Eu removi o @Getter daqui para forçar a compilação manual
import lombok.ToString;

@ToString
public class RequisicaoCompra {
    private final double valor;
    private final String proposito;
    private boolean aprovada = false;
    private String aprovador = "Ninguém";

    public RequisicaoCompra(double valor, String proposito) {
        this.valor = valor;
        this.proposito = proposito;
    }

    public void aprovar(String nomeAprovador) {
        this.aprovada = true;
        this.aprovador = nomeAprovador;
    }

    // --- ESTA É A CORREÇÃO MANUAL ---
    // Adicionando os métodos que o Lombok deveria ter criado

    public double getValor() {
        return this.valor;
    }

    public String getAprovador() {
        return this.aprovador;
    }
    
    public String getProposito() {
        return this.proposito;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }
}