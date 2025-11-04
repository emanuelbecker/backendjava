package com.trabalho.patterns.behavioral.iterator;

// 2. A interface da "Coleção" (ou "Agregado")
public interface MyIterableCollection<T> {
    MyIterator<T> createIterator();
}