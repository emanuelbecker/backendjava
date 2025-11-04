package com.trabalho.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// 3. O "Composto" (Composite)
// Ele contém uma coleção de "Componentes" (que podem ser outros Gerentes ou Empregados)
public class Gerente implements ComponenteOrganograma {

    private String nome;
    private String cargo;
    
    // A lista de filhos
    private List<ComponenteOrganograma> subordinados = new ArrayList<>();

    public Gerente(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String exibirDetalhes() {
        // 1. Exibe seus próprios detalhes
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("<b>+ Gerente: " + nome + " (Cargo: " + cargo + ")</b><br>");

        // 2. Chama recursivamente o método para todos os seus filhos
        for (ComponenteOrganograma subordinado : subordinados) {
            detalhes.append(subordinado.exibirDetalhes());
        }
        
        return detalhes.toString();
    }

    // Gerentes podem adicionar e remover subordinados
    @Override
    public void adicionar(ComponenteOrganograma componente) {
        subordinados.add(componente);
    }

    @Override
    public void remover(ComponenteOrganograma componente) {
        subordinados.remove(componente);
    }
}