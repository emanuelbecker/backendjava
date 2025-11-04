package com.trabalho.patterns.behavioral.state;

// 3. Estado Concreto A
public class EstadoPronto implements State {

    private PlayerContext player;

    public EstadoPronto(PlayerContext player) {
        this.player = player;
    }

    @Override
    public String clicarPlay() {
        // Ação: Começa a tocar
        // E muda o estado do player para "Tocando"
        player.mudarEstado(new EstadoTocando(player));
        return "Iniciando a música... Estado: TOCANDO<br>";
    }

    @Override
    public String clicarPause() {
        // Não faz nada se estiver "Pronto"
        return "Não faz nada (já estava 'Pronto').<br>";
    }

    @Override
    public String clicarStop() {
        // Não faz nada se estiver "Pronto"
        return "Não faz nada (já estava 'Pronto').<br>";
    }
}