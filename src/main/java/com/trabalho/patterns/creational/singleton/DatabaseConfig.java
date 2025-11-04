package com.trabalho.patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

public class DatabaseConfig {
    
    // 1. A única instância (estática)
    private static DatabaseConfig instance;

    // 2. Dados de configuração (para o exemplo)
    @Getter @Setter
    private String databaseUrl;

    // 3. O construtor DEVE ser privado
    private DatabaseConfig() {
        // Simula o custo de inicialização
        this.databaseUrl = "jdbc://default:5432";
    }

    // 4. O método de acesso global (estático)
    public static DatabaseConfig getInstance() {
        // "Lazy loading" - Só cria se for nulo
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl; // <-- CORRIGIDO
    }

    public String getDatabaseUrl() {
        return this.databaseUrl; // <-- CORRIGIDO
    }
}