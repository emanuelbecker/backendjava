package com.trabalho.patterns.structural.adapter;

// 2. A classe nova que queremos usar, mas é INCOMPATÍVEL
public class ProvedorNovoPagamento {
    
    // O nome do método é diferente e recebe um 'int'
    public String executarCobrancaEmCentavos(int valorEmCentavos) {
        // ...lógica...
        return "Cobrança de " + valorEmCentavos + " centavos realizada pela API NOVA.";
    }
}