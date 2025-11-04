package com.trabalho.patterns.behavioral.state;

// 5. Estado Concreto C
public class EstadoPausado implements State {

    private PlayerContext player;

    public EstadoPausado(PlayerContext player) {
        this.player = player;
    }

    @Override
    public String clicarPlay() {
        // Ação: Volta a tocar
        // E muda o estado para "Tocando"
        player.mudarEstado(new EstadoTocando(player));
        return "Continuando a música... Estado: TOCANDO<br>";
    }

    @Override
    public String clicarPause() {
        // Não faz nada se já está pausado
        return "Não faz nada (já estava 'Pausado').<br>";
    }

    @Override
    public String clicarStop() {
        // Ação: Para a música
        // E muda o estado para "Pronto"
        player.mudarEstado(new EstadoPronto(player));
        return "Música parada. Voltando ao início. Estado: PRONTO<br>";
    }
}