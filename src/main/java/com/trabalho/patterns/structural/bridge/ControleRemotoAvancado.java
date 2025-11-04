package com.trabalho.patterns.structural.bridge;

// 3. Uma "Abstração Refinada"
// Podemos estender a Abstração (Controle) sem tocar na Implementação (Device)
public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Device device) {
        super(device);
    }

    // Novo método que só existe neste controle
    public String mudo() {
        device.setCanal(0); // Simulação de "mudo"
        return device.getNome() + " está mudo (canal 0).";
    }
}