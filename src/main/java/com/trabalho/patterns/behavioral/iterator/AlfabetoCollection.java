package com.trabalho.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

// 3. A "Coleção Concreta"
public class AlfabetoCollection implements MyIterableCollection<String> {

    // A coleção interna. Poderia ser um array, um map, qualquer coisa.
    // O cliente não saberá disso.
    private List<String> letras = new ArrayList<>();

    public void adicionarLetra(String letra) {
        this.letras.add(letra);
    }
    
    // Método para o iterador acessar os dados (poderia ser privado/protected)
    public List<String> getItens() {
        return letras;
    }

    // A fábrica de iteradores
    @Override
    public MyIterator<String> createIterator() {
        // Retorna um novo iterador específico para esta coleção
        return new AlfabetoIterator(this);
    }
}