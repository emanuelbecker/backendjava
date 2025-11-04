package com.trabalho.patterns.structural.bridge;

// 2. A "Abstração" (o alto nível)
// Ela "tem" uma implementação (o Device), construindo a "ponte" (Bridge)
public class ControleRemoto {
    
    // A PONTE: A abstração contém uma referência à implementação
    protected Device device;

    public ControleRemoto(Device device) {
        this.device = device;
    }

    // Métodos de alto nível que "traduzem" para o baixo nível
    public String togglePower() {
        if (device.isLigado()) {
            device.desligar();
            return device.getNome() + " desligada.";
        } else {
            device.ligar();
            return device.getNome() + " ligada.";
        }
    }

    public String proximoCanal() {
        device.setCanal(device.getCanal() + 1);
        return device.getNome() + " agora está no canal " + device.getCanal();
    }
}