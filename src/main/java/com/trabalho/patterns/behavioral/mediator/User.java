package com.trabalho.patterns.behavioral.mediator;

// 2. A classe "Colega" (Colleague)
public class User {
    private String nome;
    
    // O Colega "conhece" o Mediador
    private ChatMediator mediador;

    public User(String nome, ChatMediator mediador) {
        this.nome = nome;
        this.mediador = mediador;
        // Ao ser criado, o usuário já se registra no mediador
        mediador.adicionarUser(this);
    }

    public String getNome() {
        return nome;
    }

    // O Usuário não envia a mensagem "para alguém",
    // ele envia a mensagem "para o mediador".
    public void enviar(String mensagem) {
        System.out.println("LOG MEDIATOR: " + this.nome + " enviou: '" + mensagem + "'");
        mediador.enviarMensagem(mensagem, this);
    }

    // O Usuário tem um método para "receber" a mensagem do mediador
    public String receber(String mensagem, String remetente) {
        String log = "<b>[" + this.nome + " recebeu]:</b> '" + mensagem + "' <i>(de " + remetente + ")</i><br>";
        System.out.println("LOG MEDIATOR: " + log);
        return log;
    }
}