package com.trabalho.patterns.behavioral.iterator;

// 1. A interface "Iterator"
public interface MyIterator<T> {
    boolean hasNext(); // Tem um próximo elemento?
    T next();          // Retorna o próximo elemento
}