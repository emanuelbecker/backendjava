package com.trabalho.patterns.structural.composite;

import lombok.AllArgsConstructor; // <-- VERIFIQUE SE ESTE IMPORT ESTÁ AQUI

// 2. A "Folha" (Leaf)
@AllArgsConstructor // <-- ESTA ANOTAÇÃO É A CHAVE. ELA CRIA O CONSTRUTOR.
public class Empregado implements ComponenteOrganograma {

    private String nome;
    private String cargo;

    @Override
    public String exibirDetalhes() {
        return " &nbsp; &nbsp; - Empregado: " + nome + " (Cargo: " + cargo + ")<br>";
    }
}