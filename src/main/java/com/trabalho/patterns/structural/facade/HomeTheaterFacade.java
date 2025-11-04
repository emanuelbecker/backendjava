package com.trabalho.patterns.structural.facade;

// 5. A FACHADA
// Ela "conhece" todas as partes do subsistema complexo
public class HomeTheaterFacade {
    
    // Referências para todas as partes
    private Amplificador amp;
    private PlayerBluRay player;
    private Projetor projetor;
    private LuzesAmbiente luzes;

    // A fachada inicializa o subsistema
    public HomeTheaterFacade(Amplificador amp, PlayerBluRay player, Projetor projetor, LuzesAmbiente luzes) {
        this.amp = amp;
        this.player = player;
        this.projetor = projetor;
        this.luzes = luzes;
    }

    // --- Métodos Simplificados ---

    /**
     * Este é o método da fachada. Esconde toda a complexidade.
     */
    public String assistirFilme(String filme) {
        String log = "<b>Preparando para assistir '" + filme + "'...</b><br>";
        log += luzes.diminuir(10) + "<br>";
        log += projetor.ligar() + "<br>";
        log += projetor.modoWideScreen() + "<br>";
        log += amp.ligar() + "<br>";
        log += amp.setVolume(7) + "<br>";
        log += player.ligar() + "<br>";
        log += player.play(filme) + "<br>";
        return log;
    }

    /**
     * Outro método simplificado.
     */
    public String pararFilme() {
        String log = "<b>Desligando o home theater...</b><br>";
        log += luzes.acender() + "<br>";
        log += projetor.desligar() + "<br>";
        log += amp.desligar() + "<br>";
        log += player.desligar() + "<br>";
        return log;
    }
}