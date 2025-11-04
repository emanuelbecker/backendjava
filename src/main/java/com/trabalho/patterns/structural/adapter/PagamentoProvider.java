package com.trabalho.patterns.structural.adapter;

// 1. A interface que NOSSO SISTEMA entende
public interface PagamentoProvider {
    String processarPagamento(double valor);
}