package com.trabalho.patterns.behavioral.iterator;

import java.util.List;

// 4. O "Iterador Concreto"
public class AlfabetoIterator implements MyIterator<String> {

    private AlfabetoCollection colecao;
    private List<String> itens;
    private int posicaoAtual = 0; // O estado interno do iterador

    public AlfabetoIterator(AlfabetoCollection colecao) {
        this.colecao = colecao;
        this.itens = colecao.getItens();
    }

    @Override
    public boolean hasNext() {
        // Verifica se a posição atual é válida dentro da lista
        return posicaoAtual < itens.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null; // Ou lançar uma Exceção (NoSuchElementException)
        }
        
        // Pega o item atual
        String item = itens.get(posicaoAtual);
        // Avança o iterador para a próxima posição
        posicaoAtual++;
        
        return item;
    }
}