package com.trabalho.patterns.behavioral.visitor;

// 4. "Visitante Concreto" B - Operação de Gerar Relatório
public class RelatorioVisitor implements Visitor {

    private StringBuilder relatorio = new StringBuilder();

    @Override
    public void visit(Livro livro) {
        relatorio.append("Livro: '" + livro.getNome() + "' (ISBN: " + livro.getIsbn() + ")<br>");
    }

    @Override
    public void visit(Dvd dvd) {
        relatorio.append("DVD: '" + dvd.getTitulo() + "'<br>");
    }
    
    public String getRelatorio() {
        return relatorio.toString();
    }
}