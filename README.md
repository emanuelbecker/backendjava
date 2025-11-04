# Catálogo de Demonstração: 23 Padrões de Projeto (GoF)

Este projeto é um microsserviço Java/Spring Boot que implementa e demonstra todos os 23 padrões de projeto "Gang of Four" (GoF).

## 1. Visão Geral do Projeto

Este repositório foi criado como um projeto acadêmico para demonstrar a implementação prática dos 23 Padrões de Projeto (Design Patterns) clássicos.

A arquitetura escolhida foi a criação de um **único microsserviço** back-end usando **Spring Boot**. Cada padrão de projeto é isolado em seu próprio pacote Java para clareza e pode ser testado individualmente através de um **endpoint de API REST** dedicado.

Um `DemoController` central atua como o "testador", configurando e executando cada padrão e retornando um log em HTML que prova seu funcionamento.

## 2. Tecnologias Utilizadas

* **Java 17** (ou superior)
* **Spring Boot 3+** (para o servidor web e API REST)
* **Apache Maven** (para gerenciamento de dependências)
* **Lombok** (para reduzir código boilerplate, como Getters e Setters)

## 3. Como Executar o Projeto

Siga estes passos para executar o catálogo em sua máquina local.

### Pré-requisitos

* JDK 17 (ou superior) instalado e configurado.
* Uma IDE Java, como **VS Code** (com o "Extension Pack for Java") ou **IntelliJ IDEA**.

### Passos para Execução

1.  **Clone o Repositório**
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    cd trabalho-patterns
    ```

2.  **Abra o Projeto na IDE**
    * No VS Code: `File > Open Folder...` e selecione a pasta `trabalho-patterns`.
    * No IntelliJ: `File > Open...` e selecione o arquivo `pom.xml`.

3.  **Importe as Dependências (Crucial!)**
    * Aguarde a sua IDE (usando o Maven) baixar e sincronizar todas as dependências listadas no `pom.xml`.
    * **No VS Code:** Se os erros (sublinhados vermelhos) não desaparecerem, abra a Paleta de Comandos (`Ctrl+Shift+P`) e execute `Java: Clean Java Language Server Workspace`.

4.  **Execute o Microsserviço**
    * Encontre a classe principal: `src/main/java/com/trabalho/patterns/TrabalhoPatternsApplication.java`.
    * **No VS Code:** Use a dashboard "SPRING BOOT" (ícone 'S' verde) e clique no botão "Play" (Executar) ao lado do nome `trabalho-patterns`.
    * **No IntelliJ:** Clique com o botão direito no arquivo e selecione "Run 'TrabalhoPatternsApplication'".

5.  **Servidor Ativo**
    * O console deve mostrar `Tomcat started on port(s): 8080`.
    * O servidor agora está ouvindo em `http://localhost:8080`.
    * O caminho base para os testes é: `http://localhost:8080/demo`

## 4. Endpoints da API (Como Testar Cada Padrão)

Para testar cada padrão, basta abrir as seguintes URLs em seu navegador.

**URL Base:** `http://localhost:8080/demo`

---

### Padrões Criacionais (Creational)

| Padrão | URL de Teste |
| :--- | :--- |
| **Singleton** | [`/singleton`](http://localhost:8080/demo/singleton) |
| **Builder** | [`/builder`](http://localhost:8080/demo/builder) |
| **Prototype** | [`/prototype`](http://localhost:8080/demo/prototype) |
| **Factory Method** | [`/factory-method?tipo=terra`](http://localhost:8080/demo/factory-method?tipo=terra) <br> [`/factory-method?tipo=mar`](http://localhost:8080/demo/factory-method?tipo=mar) |
| **Abstract Factory** | [`/abstract-factory?theme=light`](http://localhost:8080/demo/abstract-factory?theme=light) <br> [`/abstract-factory?theme=dark`](http://localhost:8080/demo/abstract-factory?theme=dark) |

---

### Padrões Estruturais (Structural)

| Padrão | URL de Teste |
| :--- | :--- |
| **Adapter** | [`/adapter`](http://localhost:8080/demo/adapter) |
| **Bridge** | [`/bridge`](http://localhost:8080/demo/bridge) |
| **Composite** | [`/composite`](http://localhost:8080/demo/composite) |
| **Decorator** | [`/decorator`](http://localhost:8080/demo/decorator) |
| **Façade** | [`/facade`](http://localhost:8080/demo/facade) |
| **Flyweight** | [`/flyweight`](http://localhost:8080/demo/flyweight) |
| **Proxy** | [`/proxy`](http://localhost:8080/demo/proxy) |

---

### Padrões Comportamentais (Behavioral)

| Padrão | URL de Teste |
| :--- | :--- |
| **Strategy** | [`/strategy?tipo=pix`](http://localhost:8080/demo/strategy?tipo=pix) <br> [`/strategy?tipo=cartao`](http://localhost:8080/demo/strategy?tipo=cartao) |
| **Chain of Responsibility**| [`/chain-of-responsibility`](http://localhost:8080/demo/chain-of-responsibility) |
| **Command** | [`/command`](http://localhost:8080/demo/command) |
| **Interpreter** | [`/interpreter`](http://localhost:8080/demo/interpreter) |
| **Iterator** | [`/iterator`](http://localhost:8080/demo/iterator) |
| **Mediator** | [`/mediator`](http://localhost:8080/demo/mediator) |
| **Memento** | [`/memento`](http://localhost:8080/demo/memento) |
| **Observer** | [`/observer`](http://localhost:8080/demo/observer) |
| **State** | [`/state`](http://localhost:8080/demo/state) |
| **Template Method** | [`/template-method`](http://localhost:8080/demo/template-method) |
| **Visitor** | [`/visitor`](http://localhost:8080/demo/visitor) |

## 5. Estrutura do Código

O código-fonte está organizado por categoria de padrão para facilitar a navegação:

```
trabalho-patterns/
├── pom.xml                        (Dependências do Maven)
└── src/main/java/com/trabalho/patterns/
    ├── TrabalhoPatternsApplication.java (Classe 'main' que inicia o Spring)
    ├── DemoController.java          (API REST que executa os testes)
    │
    ├── creational/                  (Padrões Criacionais)
    │   ├── abstractfactory/
    │   ├── builder/
    │   ├── factorymethod/
    │   ├── prototype/
    │   └── singleton/
    │
    ├── structural/                  (Padrões Estruturais)
    │   ├── adapter/
    │   ├── bridge/
    │   ├── composite/
    │   ├── decorator/
    │   ├── facade/
    │   ├── flyweight/
    │   └── proxy/
    │
    └── behavioral/                  (Padrões Comportamentais)
        ├── chainofresponsibility/
        ├── command/
        ├── interpreter/
        ├── iterator/
        ├── mediator/
        ├── memento/
        ├── observer/
        ├── state/
        ├── strategy/
        ├── templatemethod/
        └── visitor/
```