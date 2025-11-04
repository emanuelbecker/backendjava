package com.trabalho.patterns.behavioral.state;

// 4. Estado Concreto B
public class EstadoTocando implements State {

    private PlayerContext player;

    public EstadoTocando(PlayerContext player) {
        this.player = player;
    }

    @Override
    public String clicarPlay() {
        // Ação: Pausa
        // E muda o estado para "Pausado"
        player.mudarEstado(new EstadoPausado(player));
        return "Música pausada. Estado: PAUSADO<br>";
    }

    @Override
    public String clicarPause() {
        // (Ação duplicada, Play/Pause fazem o mesmo neste estado)
        player.mudarEstado(new EstadoPausado(player));
        return "Música pausada. Estado: PAUSADO<br>";
    }

    @Override
    public String clicarStop() {
        // Ação: Para a música
        // E muda o estado de volta para "Pronto"
        player.mudarEstado(new EstadoPronto(player));
        return "Música parada. Voltando ao início. Estado: PRONTO<br>";
    }
}