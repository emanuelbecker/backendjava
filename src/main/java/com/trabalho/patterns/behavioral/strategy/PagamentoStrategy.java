package com.trabalho.patterns.behavioral.strategy;

// 1. A interface da Estratégia
public interface PagamentoStrategy {
    String pagar(double valor);
}