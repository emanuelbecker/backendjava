package com.trabalho.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// 2. A Fábrica Flyweight
// Ela gerencia o "pool" de objetos Flyweight
public class FabricaTipoCaractere {
    
    // O "cache" ou "pool" de flyweights.
    private static final Map<Character, TipoCaractere> cache = new HashMap<>();

    // O método da fábrica
    public static TipoCaractere getTipoCaractere(char simbolo) {
        
        // Verifica se já criamos um flyweight para este símbolo
        TipoCaractere tipo = cache.get(simbolo);
        
        if (tipo == null) {
            // Não existe? Então cria um NOVO
            // (Simulando que A/B/C têm fontes diferentes)
            switch (simbolo) {
                case 'A':
                    tipo = new TipoCaractere('A', "Arial", 12);
                    break;
                case 'B':
                    tipo = new TipoCaractere('B', "Times New Roman", 14);
                    break;
                case 'C':
                    tipo = new TipoCaractere('C', "Comic Sans", 10);
                    break;
                default:
                    tipo = new TipoCaractere(simbolo, "Arial", 12);
            }
            // E o mais importante: armazena no cache para reutilizar
            cache.put(simbolo, tipo);
        }
        
        // Retorna o flyweight (novo ou do cache)
        return tipo;
    }
}