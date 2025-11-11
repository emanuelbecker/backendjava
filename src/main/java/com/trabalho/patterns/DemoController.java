package com.trabalho.patterns;

import com.trabalho.patterns.behavioral.chainofresponsibility.Aprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.AssistenteAprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.DiretorAprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.GerenteAprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.RequisicaoCompra;
import com.trabalho.patterns.behavioral.command.Command;
import com.trabalho.patterns.behavioral.command.ControleRemotoSimples;
import com.trabalho.patterns.behavioral.command.DesligarLuzCommand;
import com.trabalho.patterns.behavioral.command.LigarLuzCommand;
import com.trabalho.patterns.behavioral.command.Luz;
import com.trabalho.patterns.behavioral.strategy.*;
import com.trabalho.patterns.behavioral.templatemethod.CsvDataProcessor;
import com.trabalho.patterns.behavioral.templatemethod.DataProcessor;
import com.trabalho.patterns.behavioral.templatemethod.JsonDataProcessor;
import com.trabalho.patterns.behavioral.visitor.CalculadorPrecoVisitor;
import com.trabalho.patterns.behavioral.visitor.Dvd;
import com.trabalho.patterns.behavioral.visitor.ItemElemento;
import com.trabalho.patterns.behavioral.visitor.Livro;
import com.trabalho.patterns.behavioral.visitor.RelatorioVisitor;
import com.trabalho.patterns.creational.abstractfactory.DarkModeFactory;
import com.trabalho.patterns.creational.abstractfactory.GUIFactory;
import com.trabalho.patterns.creational.abstractfactory.LightModeFactory;
import com.trabalho.patterns.creational.builder.CarroBuilder;
import com.trabalho.patterns.creational.builder.Diretor;
import com.trabalho.patterns.creational.builder.Veiculo;
import com.trabalho.patterns.creational.factorymethod.Logistica;
import com.trabalho.patterns.creational.factorymethod.LogisticaMaritima;
import com.trabalho.patterns.creational.factorymethod.LogisticaTerrestre;
import com.trabalho.patterns.creational.prototype.Circulo;
import com.trabalho.patterns.creational.singleton.DatabaseConfig;
import com.trabalho.patterns.structural.adapter.*;
import com.trabalho.patterns.structural.bridge.ControleRemoto;
import com.trabalho.patterns.structural.bridge.ControleRemotoAvancado;
import com.trabalho.patterns.structural.bridge.Device;
import com.trabalho.patterns.structural.bridge.Radio;
import com.trabalho.patterns.structural.bridge.Tv;
import com.trabalho.patterns.structural.composite.Empregado;
import com.trabalho.patterns.structural.composite.Gerente;
import com.trabalho.patterns.structural.decorator.Cafe;
import com.trabalho.patterns.structural.decorator.CafeSimples;
import com.trabalho.patterns.structural.decorator.ComChocolate;
import com.trabalho.patterns.structural.decorator.ComLeite;
import com.trabalho.patterns.structural.facade.Amplificador;
import com.trabalho.patterns.structural.facade.HomeTheaterFacade;
import com.trabalho.patterns.structural.facade.LuzesAmbiente;
import com.trabalho.patterns.structural.facade.PlayerBluRay;
import com.trabalho.patterns.structural.facade.Projetor;
import com.trabalho.patterns.structural.flyweight.Caractere;
import com.trabalho.patterns.structural.proxy.Imagem;
import com.trabalho.patterns.structural.proxy.ProxyImagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.patterns.creational.builder.CarroBuilder;
import com.trabalho.patterns.creational.builder.Diretor;
import com.trabalho.patterns.creational.builder.Veiculo;
import com.trabalho.patterns.creational.abstractfactory.Application;
import com.trabalho.patterns.creational.abstractfactory.DarkModeFactory;
import com.trabalho.patterns.creational.abstractfactory.GUIFactory;
import com.trabalho.patterns.creational.abstractfactory.LightModeFactory;
import com.trabalho.patterns.structural.bridge.ControleRemoto;
import com.trabalho.patterns.structural.bridge.ControleRemotoAvancado;
import com.trabalho.patterns.structural.bridge.Device;
import com.trabalho.patterns.structural.bridge.Radio;
import com.trabalho.patterns.structural.bridge.Tv;
import com.trabalho.patterns.structural.composite.Empregado;
import com.trabalho.patterns.structural.composite.Gerente;
import com.trabalho.patterns.structural.decorator.Cafe;
import com.trabalho.patterns.structural.decorator.CafeSimples;
import com.trabalho.patterns.structural.decorator.ComChocolate;
import com.trabalho.patterns.structural.decorator.ComLeite;
// Importa a Fachada
import com.trabalho.patterns.structural.facade.HomeTheaterFacade;
// Importa o subsistema
import com.trabalho.patterns.structural.facade.Amplificador;
import com.trabalho.patterns.structural.facade.LuzesAmbiente;
import com.trabalho.patterns.structural.facade.PlayerBluRay;
import com.trabalho.patterns.structural.facade.Projetor;
import com.trabalho.patterns.structural.flyweight.Caractere;
import com.trabalho.patterns.structural.proxy.Imagem;
import com.trabalho.patterns.structural.proxy.ProxyImagem;
// Importa o Handler abstrato e os concretos
import com.trabalho.patterns.behavioral.chainofresponsibility.Aprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.AssistenteAprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.GerenteAprovador;
import com.trabalho.patterns.behavioral.chainofresponsibility.DiretorAprovador;
// Importa o objeto da Requisição
import com.trabalho.patterns.behavioral.chainofresponsibility.RequisicaoCompra;

// Importa o Invocador
import com.trabalho.patterns.behavioral.command.ControleRemotoSimples;
// Importa o Receptor
import com.trabalho.patterns.behavioral.command.Luz;
// Importa os Comandos
import com.trabalho.patterns.behavioral.command.Command;
import com.trabalho.patterns.behavioral.command.LigarLuzCommand;
import com.trabalho.patterns.behavioral.command.DesligarLuzCommand;

// Importa a interface e as implementações do Interpreter
import com.trabalho.patterns.behavioral.interpreter.Expression;
import com.trabalho.patterns.behavioral.interpreter.MinusExpression;
import com.trabalho.patterns.behavioral.interpreter.NumberExpression;
import com.trabalho.patterns.behavioral.interpreter.PlusExpression;
import com.trabalho.patterns.behavioral.iterator.AlfabetoCollection;
import com.trabalho.patterns.behavioral.iterator.MyIterator;
import com.trabalho.patterns.behavioral.mediator.ChatRoom;
// Importa as classes do Iterator
import com.trabalho.patterns.behavioral.iterator.AlfabetoCollection;
import com.trabalho.patterns.behavioral.iterator.MyIterator;
// Importa as classes do Mediator
import com.trabalho.patterns.behavioral.mediator.ChatRoom;
import com.trabalho.patterns.behavioral.mediator.User;
import com.trabalho.patterns.behavioral.memento.Editor;
import com.trabalho.patterns.behavioral.memento.Historico;
import com.trabalho.patterns.behavioral.observer.Cliente;
import com.trabalho.patterns.behavioral.observer.Loja;
// Importa as classes do Memento
import com.trabalho.patterns.behavioral.memento.Editor;
import com.trabalho.patterns.behavioral.memento.Historico;

// Importa as classes do Observer
import com.trabalho.patterns.behavioral.observer.Loja;
import com.trabalho.patterns.behavioral.observer.Cliente;
import com.trabalho.patterns.behavioral.observer.Observer;
import com.trabalho.patterns.behavioral.state.PlayerContext;
// Importa o Contexto do State
import com.trabalho.patterns.behavioral.state.PlayerContext;
// Importa as classes do Template Method
import com.trabalho.patterns.behavioral.templatemethod.DataProcessor;
import com.trabalho.patterns.behavioral.templatemethod.CsvDataProcessor;
import com.trabalho.patterns.behavioral.templatemethod.JsonDataProcessor;
// Importa as classes do Visitor
import com.trabalho.patterns.behavioral.visitor.ItemElemento;
import com.trabalho.patterns.behavioral.visitor.Livro;
import com.trabalho.patterns.behavioral.visitor.Dvd;
import com.trabalho.patterns.behavioral.visitor.CalculadorPrecoVisitor;
import com.trabalho.patterns.behavioral.visitor.RelatorioVisitor;

// Importa as classes do Factory Method
import com.trabalho.patterns.creational.factorymethod.Logistica;
import com.trabalho.patterns.creational.factorymethod.LogisticaMaritima;
import com.trabalho.patterns.creational.factorymethod.LogisticaTerrestre;


@RestController // Torna esta classe um controlador de API
public class DemoController {

    /**
     * Demonstração do Padrão Singleton (Criacional)
     * URL: http://localhost:8080/demo/singleton
     */
    @GetMapping("/singleton")
    public String testSingleton() {
        // Pega a instância 1
        DatabaseConfig config1 = DatabaseConfig.getInstance();
        config1.setDatabaseUrl("jdbc://mysql:3306");

        // Pega a instância 2
        DatabaseConfig config2 = DatabaseConfig.getInstance();

        // Compara as duas. Elas serão o MESMO objeto.
        String resultado = "Config1: " + config1.getDatabaseUrl() + "<br>";
        resultado += "Config2: " + config2.getDatabaseUrl() + "<br>";
        resultado += "Os hashcodes são iguais? (mesmo objeto): " + (config1.hashCode() == config2.hashCode());
        
        return resultado;
    }

    /**
     * Demonstração do Padrão Strategy (Comportamental)
     * URL: http://localhost:8080/demo/strategy?tipo=pix
     * URL: http://localhost:8080/demo/strategy?tipo=cartao
     */
    @GetMapping("/strategy")
    public String testStrategy(@RequestParam(defaultValue = "pix") String tipo) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setValorTotal(150.75);
        String resultado;

        if ("cartao".equals(tipo)) {
            // Define a ESTRATÉGIA de pagamento para Cartão
            carrinho.setEstrategiaDePagamento(new PagamentoCartao("1234...")); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
            resultado = carrinho.finalizarCompra();
        } else {
            // Define a ESTRATÉGIA de pagamento para Pix
            carrinho.setEstrategiaDePagamento(new PagamentoPix("chave-aleatoria")); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
            resultado = carrinho.finalizarCompra(); 
        }

        return "Carrinho finalizado: <br>" + resultado;
    }

    /**
     * Demonstração do Padrão Adapter (Estrutural)
     * URL: http://localhost:8080/demo/adapter
     */
    @GetMapping("/adapter")
    public String testAdapter() {
        // Nosso sistema só entende a interface "PagamentoProvider"
        // Mas a API nova só nos dá um "ProvedorNovoPagamento"

        ProvedorNovoPagamento provedorNovo = new ProvedorNovoPagamento();
        
        // Criamos um ADAPTADOR para fazer o novo provedor "caber" na nossa interface
        PagamentoProvider adaptador = new PagamentoAdapter(provedorNovo);

        // Agora nosso sistema consegue usar o provedor novo sem saber
        String resultado = "Nosso sistema chama 'processarPagamento()': <br>";
        resultado += adaptador.processarPagamento(100.0);
        
        return resultado;
    }
    /**
     * Demonstração do Padrão Builder (Criacional)
     * URL: http://localhost:8080/demo/builder
     */
    @GetMapping("/builder")
    public String testBuilder() {
        // 1. Criamos o construtor específico (CarroBuilder)
        CarroBuilder builder = new CarroBuilder();

        // 2. Criamos o Diretor e passamos o construtor para ele
        Diretor diretor = new Diretor(builder);

        // 3. O Diretor constrói um "Carro Esportivo" usando a receita
        Veiculo carroEsportivo = diretor.construirCarroEsportivo();

        // 4. O Diretor constrói um "Carro Popular"
        Veiculo carroPopular = diretor.construirCarroPopular();

        // 5. Também podemos construir "manualmente"
        builder.resetar();
        builder.construirMotor("Elétrico");
        builder.definirAssentos(5);
        builder.adicionarGPS(true);
        builder.pintar("Azul Tesla");
        Veiculo carroCustom = builder.getResultado();

        // Retornamos o resultado (o Lombok @ToString ajuda aqui)
        String resultado = "<b>--- Builder ---</b><br><br>";
        resultado += "<b>Carro Esportivo (Receita do Diretor):</b><br>" + carroEsportivo.toString() + "<br><br>";
        resultado += "<b>Carro Popular (Receita do Diretor):</b><br>" + carroPopular.toString() + "<br><br>";
        resultado += "<b>Carro Custom (Manual):</b><br>" + carroCustom.toString();

        return resultado;
    }

    /**
     * Demonstração do Padrão Prototype (Criacional)
     * URL: http://localhost:8080/demo/prototype
     */
    @GetMapping("/prototype")
    public String testPrototype() {
        // 1. Criamos nosso objeto "protótipo" original
        Circulo circuloOriginal = new Circulo();
        circuloOriginal.setRaio(10); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        circuloOriginal.setCor("Vermelho"); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        circuloOriginal.setX(5); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        circuloOriginal.setY(5); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA

        // 2. Usamos o padrão Prototype para CLONAR o objeto
        Circulo circuloClonado = (Circulo) circuloOriginal.clonar();

        // 3. Vamos provar que são objetos diferentes
        boolean saoObjetosDiferentes = circuloOriginal.hashCode() != circuloClonado.hashCode();
        
        // 4. Vamos provar que eles têm o mesmo conteúdo (antes de qualquer mudança)
        boolean temConteudoIgual = circuloOriginal.equals(circuloClonado);

        // 5. Agora, vamos mudar o original. O clone NÃO deve ser afetado.
        circuloOriginal.setCor("Azul");
        
        String resultado = "<b>--- Prototype ---</b><br><br>";
        resultado += "<b>Original:</b> " + circuloOriginal.toString() + "<br>";
        resultado += "<b>Clonado:</b> " + circuloClonado.toString() + "<br><br>";
        resultado += "São objetos diferentes na memória? " + saoObjetosDiferentes + "<br>";
        resultado += "Tinham o mesmo conteúdo logo após clonar? " + temConteudoIgual + "<br>";
        resultado += "Mudei a cor do Original para Azul. O clone foi afetado? " + (circuloOriginal.getCor().equals(circuloClonado.getCor()));

        return resultado;
    }

    /**
     * Demonstração do Padrão Abstract Factory (Criacional)
     * URL: http://localhost:8080/demo/abstract-factory?theme=light
     * URL: http://localhost:8080/demo/abstract-factory?theme=dark
     */
    @GetMapping("/abstract-factory")
    public String testAbstractFactory(@RequestParam(defaultValue = "light") String theme) {
        
        GUIFactory factory;

        // 1. Decidimos qual "família" de produtos usar
        if ("dark".equals(theme)) {
            factory = new DarkModeFactory(); // Usamos a fábrica de Modo Escuro
        } else {
            factory = new LightModeFactory(); // Usamos a fábrica de Modo Claro
        }

        // 2. Criamos a aplicação "cliente" e injetamos a fábrica nela
        // A Aplicação não sabe (e não se importa) se o tema é "dark" ou "light"
        Application app = new Application(factory);

        // 3. A aplicação renderiza a UI usando a família de produtos correta
        String resultado = "<b>--- Abstract Factory (Tema: " + theme + ") ---</b><br>";
        resultado += app.renderizar();
        
        return resultado;
    }

    /**
     * Demonstração do Padrão Bridge (Estrutural)
     * URL: http://localhost:8080/demo/bridge
     */
    @GetMapping("/bridge")
    public String testBridge() {
        
        // 1. Criamos as implementações (os dispositivos)
        Device tv = new Tv();
        Device radio = new Radio();

        // 2. Criamos as abstrações (os controles)
        // Note como podemos "ligar" (bridge) qualquer controle a qualquer dispositivo
        
        ControleRemoto controleDaTv = new ControleRemoto(tv);
        ControleRemotoAvancado controleDoRadio = new ControleRemotoAvancado(radio);

        // 3. Usamos os controles (abstrações) sem saber o que são (implementações)
        String resultado = "<b>--- Bridge ---</b><br><br>";
        
        resultado += "<b>Usando o Controle da TV:</b><br>";
        resultado += controleDaTv.togglePower() + "<br>"; // Liga a TV
        resultado += controleDaTv.proximoCanal() + "<br><br>"; // TV canal 11
        
        resultado += "<b>Usando o Controle Avançado do Rádio:</b><br>";
        resultado += controleDoRadio.togglePower() + "<br>"; // Liga o Rádio
        resultado += controleDoRadio.mudo() + "<br><br>"; // Rádio no mudo
        
        resultado += "<b>Provando a independência:</b><br>";
        resultado += "TV está no canal: " + tv.getCanal() + "<br>"; // 11
        resultado += "Rádio está no canal: " + radio.getCanal(); // 0

        return resultado;
    }

    /**
     * Demonstração do Padrão Composite (Estrutural)
     * URL: http://localhost:8080/demo/composite
     */
    @GetMapping("/composite")
    public String testComposite() {
        
        // 1. Criamos a raiz da árvore (o CEO)
        // CORREÇÃO: Removido "nome:" e "cargo:"
        Gerente ceo = new Gerente("João Fundador", "CEO");

        // 2. Criamos os gerentes de nível médio
        Gerente gerenteTI = new Gerente("Maria Tech", "CTO");
        Gerente gerenteVendas = new Gerente("Carlos Vendas", "CSO");
        
        ceo.adicionar(gerenteTI);
        ceo.adicionar(gerenteVendas);

        // 3. Criamos os empregados (folhas)
        // CORREÇÃO: Removido "nome:" e "cargo:"
        Empregado dev1 = new Empregado("Ana Programadora", "Desenvolvedora Sênior"); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        Empregado dev2 = new Empregado("Bruno Programador", "Desenvolvedor Júnior");
        Empregado vendedor1 = new Empregado("Fernanda", "Vendedora Interna"); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA

        gerenteTI.adicionar(dev1);
        gerenteTI.adicionar(dev2);
        
        gerenteVendas.adicionar(vendedor1);
        
        // 4. Criamos um "nível 3"
        // CORREÇÃO: Removido "nome:" e "cargo:"
        Gerente gerenteInfra = new Gerente("Pedro Redes", "Chefe de Infra");
        gerenteTI.adicionar(gerenteInfra);
        gerenteInfra.adicionar(new Empregado("Lucas", "Estagiário de Redes")); // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA


        // --- O TESTE ---
        String resultado = "<b>--- Composite (Organograma da Empresa) ---</b><br><br>";
        resultado += ceo.exibirDetalhes();

        return resultado;
    }

    /**
     * Demonstração do Padrão Decorator (Estrutural)
     * URL: http://localhost:8080/demo/decorator
     */
    @GetMapping("/decorator")
    public String testDecorator() {
        
        // 1. Criamos o objeto base
        Cafe meuCafe = new CafeSimples();
        
        String resultado = "<b>--- Decorator (Montando um Café) ---</b><br><br>";
        resultado += "<b>Pedido 1:</b> " + meuCafe.getDescricao() + " // Preço: R$ " + meuCafe.getPreco() + "<br>";

        // 2. Agora, "decoramos" o café com Leite
        meuCafe = new ComLeite(meuCafe);
        resultado += "<b>Pedido 2 (com leite):</b> " + meuCafe.getDescricao() + " // Preço: R$ " + meuCafe.getPreco() + "<br>";
        
        // 3. E agora, "decoramos" o café (que já tem leite) com Chocolate
        meuCafe = new ComChocolate(meuCafe);
        resultado += "<b>Pedido 3 (com leite e chocolate):</b> " + meuCafe.getDescricao() + " // Preço: R$ " + meuCafe.getPreco() + "<br>";

        // 4. Exemplo de um pedido diferente (só com chocolate)
        Cafe outroCafe = new CafeSimples();
        outroCafe = new ComChocolate(outroCafe);
        resultado += "<br><b>Outro Pedido (só com chocolate):</b> " + outroCafe.getDescricao() + " // Preço: R$ " + outroCafe.getPreco();

        return resultado;
    }

    /**
     * Demonstração do Padrão Façade (Fachada) (Estrutural)
     * URL: http://localhost:8080/demo/facade
     */
    @GetMapping("/facade")
    public String testFacade() {
        
        // 1. Inicializamos o subsistema complexo (isso poderia estar escondido)
        Amplificador amp = new Amplificador();
        PlayerBluRay player = new PlayerBluRay();
        Projetor projetor = new Projetor();
        LuzesAmbiente luzes = new LuzesAmbiente();

        // 2. Criamos a FACHADA, entregando o subsistema para ela
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player, projetor, luzes);

        // --- O TESTE ---
        // Agora, em vez de 10 chamadas, fazemos UMA
        
        String resultado = "<b>--- Facade (Home Theater) ---</b><br><br>";
        
        // Chamada 1: Ligar tudo
        resultado += homeTheater.assistirFilme("O Senhor dos Anéis") + "<br>";
        
        // Chamada 2: Desligar tudo
        resultado += homeTheater.pararFilme();

        return resultado;
    }

    /**
     * Demonstração do Padrão Flyweight (Estrutural)
     * URL: http://localhost:8080/demo/flyweight
     */
    @GetMapping("/flyweight")
    public String testFlyweight() {
        
        String resultado = "<b>--- Flyweight (Renderizando Texto) ---</b><br><br>";
        
        String texto = "AAABBCAB"; // 8 caracteres
        
        // Vamos criar 8 objetos "Caractere"
        Caractere c1 = new Caractere('A', 10, 10);
        Caractere c2 = new Caractere('A', 20, 10);
        Caractere c3 = new Caractere('A', 30, 10);
        
        Caractere c4 = new Caractere('B', 40, 10);
        Caractere c5 = new Caractere('B', 50, 10);
        
        Caractere c6 = new Caractere('C', 60, 10);
        
        Caractere c7 = new Caractere('A', 70, 10);
        Caractere c8 = new Caractere('B', 80, 10);

        // --- Renderizando ---
        resultado += c1.renderizar();
        resultado += c2.renderizar();
        resultado += c3.renderizar();
        resultado += c4.renderizar();
        resultado += c5.renderizar();
        resultado += c6.renderizar();
        resultado += c7.renderizar();
        resultado += c8.renderizar();
        
        // --- A Prova do Padrão ---
        // Criamos 8 objetos 'Caractere', mas quantos objetos 'TipoCaractere' (Flyweights) existem?
        // Devemos ter apenas 3 (um para 'A', um para 'B', um para 'C')
        
        resultado += "<br><b>--- Provando a Economia de Memória ---</b><br>";
        
        boolean provaA = (c1.getTipo().hashCode() == c2.getTipo().hashCode()) && 
                         (c2.getTipo().hashCode() == c3.getTipo().hashCode()) && 
                         (c3.getTipo().hashCode() == c7.getTipo().hashCode());
        
        boolean provaB = (c4.getTipo().hashCode() == c5.getTipo().hashCode()) &&
                         (c5.getTipo().hashCode() == c8.getTipo().hashCode());
                         
        boolean provaC = c6.getTipo() != null; // Só para garantir

        resultado += "Todos os 4 'A' usam o MESMO objeto 'TipoCaractere'? " + provaA + " (Hash: " + c1.getTipo().hashCode() + ")<br>";
        resultado += "Todos os 3 'B' usam o MESMO objeto 'TipoCaractere'? " + provaB + " (Hash: " + c4.getTipo().hashCode() + ")<br>";
        resultado += "O 'C' é diferente dos outros? " + (c1.getTipo().hashCode() != c6.getTipo().hashCode()) + " (Hash: " + c6.getTipo().hashCode() + ")<br>";
        resultado += "<br><b>Conclusão:</b> Criamos 8 caracteres, mas apenas 3 objetos de dados pesados (Flyweights).";

        return resultado;
    } 

    /**
     * Demonstração do Padrão Proxy (Estrutural)
     * URL: http://localhost:8080/demo/proxy
     */
    @GetMapping("/proxy")
    public String testProxy() {
        
        String resultado = "<b>--- Proxy (Lazy Loading de Imagens) ---</b><br><br>";
        
        // 1. Criamos o PROXY. Esta operação é RÁPIDA (leve).
        // O objeto "ImagemReal" (pesado) AINDA NÃO FOI CRIADO.
        Imagem imagem = new ProxyImagem("foto_ferias.jpg");

        resultado += "<b>Passo 1:</b> Proxy criado.<br>";
        resultado += "Nome do arquivo (via Proxy): " + imagem.getNomeArquivo() + "<br>";
        resultado += "<i>(Note no console/log que NADA foi carregado do disco ainda)</i><br><br>";

        // 2. Agora, chamamos "exibir()" pela PRIMEIRA VEZ.
        // O Proxy vai interceptar, ver que "imagemReal" é nula,
        // e SÓ AGORA vai criar e carregar o objeto pesado.
        resultado += "<b>Passo 2:</b> Chamando .exibir() pela 1ª vez...<br>";
        resultado += imagem.exibir(); // <-- Operação LENTA (carrega do disco)
        resultado += "<i>(Note no console/log que a imagem foi 'carregada do disco')</i><br><br>";

        // 3. Chamamos "exibir()" pela SEGUNDA VEZ.
        // O Proxy vai interceptar, ver que "imagemReal" NÃO é nula,
        // e vai pular a criação. Ele apenas repassa a chamada.
        resultado += "<b>Passo 3:</b> Chamando .exibir() pela 2ª vez...<br>";
        resultado += imagem.exibir(); // <-- Operação RÁPIDA (já está em memória)
        resultado += "<i>(Note no console/log que NADA MAIS foi carregado)</i><br>";
        
        return resultado;
    }

/**
     * Demonstração do Padrão Chain of Responsibility (Comportamental)
     * URL: http://localhost:8080/demo/chain-of-responsibility
     */
    @GetMapping("/chain-of-responsibility")
    public String testChainOfResponsibility() {
        
        // 1. Criamos os "elos" (handlers)
        Aprovador assistente = new AssistenteAprovador();
        Aprovador gerente = new GerenteAprovador();
        Aprovador diretor = new DiretorAprovador();

        // 2. Montamos a CADEIA de responsabilidade (O JEITO CORRETO)
        // Assistente -> Gerente -> Diretor
        gerente.setProximo(diretor);      // 1º O Gerente aponta para o Diretor
        assistente.setProximo(gerente); // 2º O Assistente aponta para o Gerente
        
        // Agora a cadeia está correta. 'assistente' é o início.
        
        // 3. Criamos as requisições
        RequisicaoCompra req1 = new RequisicaoCompra(50.0, "Material de Escritório");
        RequisicaoCompra req2 = new RequisicaoCompra(500.0, "Cadeira de Escritório");
        RequisicaoCompra req3 = new RequisicaoCompra(5000.0, "Novo Servidor");

        // --- O TESTE ---
        String resultado = "<b>--- Chain of Responsibility (Aprovação de Despesas) ---</b><br><br>";
        
        resultado += "<b>Testando Requisição de R$ 50:</b><br>";
        resultado += assistente.processarRequisicao(req1); // Começa no assistente
        resultado += "Status Final: Aprovado por " + req1.getAprovador() + "<br><br>";

        resultado += "<b>Testando Requisição de R$ 500:</b><br>";
        resultado += assistente.processarRequisicao(req2); // Começa no assistente
        resultado += "Status Final: Aprovado por " + req2.getAprovador() + "<br><br>";

        resultado += "<b>Testando Requisição de R$ 5000:</b><br>";
        resultado += assistente.processarRequisicao(req3); // Começa no assistente
        resultado += "Status Final: Aprovado por " + req3.getAprovador() + "<br><br>";

        return resultado;
    }

    /**
     * Demonstração do Padrão Command (Comportamental)
     * URL: http://localhost:8080/demo/command
     */
    @GetMapping("/command")
    public String testCommand() {
        
        // 1. Criamos o "Invocador" (o botão)
        ControleRemotoSimples controle = new ControleRemotoSimples();

        // 2. Criamos o "Receptor" (o objeto que faz o trabalho)
        Luz luzDaSala = new Luz("Sala");

        // 3. Criamos os "Comandos" (os objetos que conectam os dois)
        Command comandoLigarLuz = new LigarLuzCommand(luzDaSala);
        Command comandoDesligarLuz = new DesligarLuzCommand(luzDaSala);

        // --- O TESTE ---
        String resultado = "<b>--- Command (Controle Remoto) ---</b><br><br>";

        // Teste 1: Programamos o botão para LIGAR e apertamos
        controle.setComando(comandoLigarLuz);
        resultado += "<b>Apertando botão (programado para LIGAR):</b><br>";
        resultado += controle.apertarBotao() + "<br>"; // Deve ligar
        resultado += controle.apertarBotao() + "<br><br>"; // Deve dizer que já estava ligada

        // Teste 2: Programamos o botão para DESLIGAR e apertamos
        controle.setComando(comandoDesligarLuz);
        resultado += "<b>Apertando botão (reprogramado para DESLIGAR):</b><br>";
        resultado += controle.apertarBotao() + "<br>"; // Deve desligar
        resultado += controle.apertarBotao() + "<br><br>"; // Deve dizer que já estava desligada

        return resultado;
    }

    /**
     * Demonstração do Padrão Interpreter (Comportamental)
     * URL: http://localhost:8080/demo/interpreter
     */
    @GetMapping("/interpreter")
    public String testInterpreter() {
        
        // Vamos interpretar a expressão: (10 + 20) - 5
        
        // 1. Criamos a primeira parte: (10 + 20)
        Expression expressaoSoma = new PlusExpression(
            new NumberExpression(10), 
            new NumberExpression(20)
        );
        
        // 2. Criamos a expressão final: (resultado_da_soma) - 5
        Expression expressaoFinal = new MinusExpression(
            expressaoSoma, 
            new NumberExpression(5)
        );
        
        // --- O TESTE ---
        // 3. Chamamos "interpret()" na expressão do topo da árvore
        int resultadoCalculado = expressaoFinal.interpret();
        
        String resultado = "<b>--- Interpreter (Mini-Calculadora) ---</b><br><br>";
        resultado += "Calculando a expressão: (10 + 20) - 5<br>";
        resultado += "<b>Resultado: " + resultadoCalculado + "</b>";

        return resultado;
    }

    /**
     * Demonstração do Padrão Iterator (Comportamental)
     * URL: http://localhost:8080/demo/iterator
     */
    @GetMapping("/iterator")
    public String testIterator() {
        
        // 1. Criamos nossa coleção customizada
        AlfabetoCollection colecao = new AlfabetoCollection();
        colecao.adicionarLetra("A");
        colecao.adicionarLetra("B");
        colecao.adicionarLetra("C");
        colecao.adicionarLetra("D");

        // --- O TESTE ---
        // 2. O cliente não sabe como a coleção funciona (se é Lista, Array, etc)
        // O cliente apenas pede um "iterador" para ela.
        MyIterator<String> iterador = colecao.createIterator();

        String resultado = "<b>--- Iterator (Percorrendo a Coleção) ---</b><br><br>";
        
        // 3. O cliente usa o iterador (padrão 'while') para percorrer
        while (iterador.hasNext()) {
            String letra = iterador.next();
            resultado += "Letra: " + letra + "<br>";
        }

        // 4. Prova de que o iterador "acabou"
        resultado += "<br>Tem próximo (hasNext)? " + iterador.hasNext(); // Deve ser 'false'

        return resultado;
    }

    /**
     * Demonstração do Padrão Mediator (Comportamental)
     * URL: http://localhost:8080/demo/mediator
     */
    @GetMapping("/mediator")
    public String testMediator() {
        
        // 1. Criamos o Mediador (a sala de chat)
        ChatRoom salaDeChat = new ChatRoom();

        // 2. Criamos os Colegas (usuários) e os conectamos ao mediador
        // Note que os usuários SÓ conhecem o mediador, não os outros usuários
        User joao = new User("João", salaDeChat);
        User maria = new User("Maria", salaDeChat);
        User carlos = new User("Carlos", salaDeChat);
        
        String resultado = "<b>--- Mediator (Sala de Chat) ---</b><br><br>";

        // --- O TESTE ---
        
        // João envia uma mensagem. O Mediador deve entregar para Maria e Carlos.
        joao.enviar("Olá a todos!");
        
        // Maria responde. O Mediador deve entregar para João e Carlos.
        maria.enviar("Olá, João! Tudo bem?");
        
        // Carlos envia. O Mediador deve entregar para João e Maria.
        carlos.enviar("Oi pessoal!");

        // Pegamos o log final da sala de chat
        resultado += salaDeChat.getLog();

        return resultado;
    }

    /**
     * Demonstração do Padrão Memento (Comportamental)
     * URL: http://localhost:8080/demo/memento
     */
    @GetMapping("/memento")
    public String testMemento() {
        
        // 1. Criamos os objetos
        Editor editor = new Editor(); // O Originador
        Historico historico = new Historico(editor); // O Zelador (Caretaker)

        String resultado = "<b>--- Memento (Função Desfazer) ---</b><br><br>";
        
        // --- O TESTE ---
        
        // Estado 1: Vazio
        resultado += "Estado atual: '" + editor.getConteudo() + "'<br>"; // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        historico.salvarSnapshot(); // Salva o estado vazio
        resultado += "<i>--- Snapshot 1 (vazio) salvo ---</i><br><br>";

        // Estado 2: "A"
        editor.digitar("A");
        resultado += "Estado atual: '" + editor.getConteudo() + "'<br>"; // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        historico.salvarSnapshot(); // Salva o estado "A"
        resultado += "<i>--- Snapshot 2 (A) salvo ---</i><br><br>";

        // Estado 3: "AB"
        editor.digitar("B");
        resultado += "Estado atual: '" + editor.getConteudo() + "'<br>"; // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        historico.salvarSnapshot(); // Salva o estado "AB"
        resultado += "<i>--- Snapshot 3 (AB) salvo ---</i><br><br>";

        // Estado 4: "ABC"
        editor.digitar("C");
        resultado += "Estado atual: '" + editor.getConteudo() + "'<br>"; // IGNORAR ESTES ERROS, ERRO DO PROPRIO JAVA
        // Não salvamos este estado
        resultado += "<i>--- (Não salvamos o 'ABC') ---</i><br><br>";
        
        // Teste de "Desfazer"
        resultado += "<b>--- Iniciando 'Desfazer' ---</b><br>";
        resultado += historico.desfazer(); // Deve voltar para "AB" (Snapshot 3)
        resultado += historico.desfazer(); // Deve voltar para "A" (Snapshot 2)
        resultado += historico.desfazer(); // Deve voltar para "" (Snapshot 1)
        resultado += historico.desfazer(); // Deve dizer que está vazio

        return resultado;
    }

    /**
     * Demonstração do Padrão Observer (Comportamental)
     * URL: http://localhost:8080/demo/observer
     */
    @GetMapping("/observer")
    public String testObserver() {
        
        // --- Hack para o Demo (Para pegar o log) ---
        // Vamos recriar e capturar o log
        
        Loja lojaDemo = new Loja();
        Cliente joaoDemo = new Cliente("João");
        Cliente mariaDemo = new Cliente("Maria");

        // *** A CORREÇÃO ESTÁ AQUI ***
        // Vamos realmente inscrever os clientes:
        lojaDemo.adicionarInscrito(joaoDemo);
        lojaDemo.adicionarInscrito(mariaDemo);
        // *****************************
        
        StringBuilder log = new StringBuilder();
        
        // Criamos um "Observer" customizado só para capturar o log para o HTML
        // (O log real dos clientes sairá no console do VS Code)
        Observer logCapturador = new Observer() {
            @Override
            public String notificar(String nomeProduto) {
                // Este log é o que vai aparecer no HTML
                log.append("<b>[Log do Navegador]:</b> Cliente notificado sobre '" + nomeProduto + "'<br>");
                return null;
            }
        };
        // Inscrevemos o capturador. Agora temos 3 inscritos.
        lojaDemo.adicionarInscrito(logCapturador); 
        
        
        log.append("<b>Loja anunciando 'Produto A':</b> (3 inscritos: João, Maria, Log)<br>");
        lojaDemo.novoProdutoChegou("Produto A"); // Deve notificar os 3
        
        lojaDemo.removerInscrito(mariaDemo);
        log.append("<br><b>Maria se desinscreveu.</b> (Agora 2 inscritos: João, Log)<br>");
        
        log.append("<b>Loja anunciando 'Produto B':</b><br>");
        lojaDemo.novoProdutoChegou("Produto B"); // Deve notificar os 2 restantes

        return "<b>--- Observer (Teste Corrigido) ---</b><br><br>" + log.toString();
    }

    /**
     * Demonstração do Padrão State (Comportamental)
     * URL: http://localhost:8080/demo/state
     */
    @GetMapping("/state")
    public String testState() {
        
        // 1. Criamos o "Contexto" (o Player)
        // Ele automaticamente começa no "EstadoPronto"
        PlayerContext player = new PlayerContext();

        String resultado = "<b>--- State (Audio Player) ---</b><br><br>";
        resultado += player.getLog(); // Mostra o log inicial

        // --- O TESTE ---
        // Vamos simular cliques no player
        
        resultado += "<b>> Clicando PAUSE (no estado PRONTO):</b><br>";
        player.clicarPause(); // Não deve fazer nada
        
        resultado += "<b>> Clicando PLAY (no estado PRONTO):</b><br>";
        player.clicarPlay(); // Deve começar a tocar (Muda para EstadoTocando)
        
        resultado += "<b>> Clicando PLAY (no estado TOCANDO):</b><br>";
        player.clicarPlay(); // Deve pausar (Muda para EstadoPausado)

        resultado += "<b>> Clicando PLAY (no estado PAUSADO):</b><br>";
        player.clicarPlay(); // Deve voltar a tocar (Muda para EstadoTocando)
        
        resultado += "<b>> Clicando STOP (no estado TOCANDO):</b><br>";
        player.clicarStop(); // Deve parar (Muda para EstadoPronto)
        
        // Retornamos o log final
        resultado += "<br><b>--- Log Final ---</b><br>" + player.getLog();
        return resultado;
    }

    /**
     * Demonstração do Padrão Template Method (Comportamental)
     * URL: http://localhost:8080/demo/template-method
     */
    @GetMapping("/template-method")
    public String testTemplateMethod() {
        
        String resultado = "<b>--- Template Method (Processador de Dados) ---</b><br><br>";
        
        // --- O TESTE 1 ---
        resultado += "<b>Processando um arquivo CSV:</b><br>";
        // 1. Criamos o processador de CSV
        DataProcessor csvProcessor = new CsvDataProcessor();
        // 2. Chamamos o "template method"
        resultado += csvProcessor.processar("dados_vendas.csv");

        // --- O TESTE 2 ---
        resultado += "<br><b>Processando um arquivo JSON:</b><br>";
        // 1. Criamos o processador de JSON
        DataProcessor jsonProcessor = new JsonDataProcessor();
        // 2. Chamamos o MESMO "template method"
        resultado += jsonProcessor.processar("configuracoes.json");
        
        return resultado;
    }

    /**
     * Demonstração do Padrão Visitor (Comportamental)
     * URL: http://localhost:8080/demo/visitor
     */
    @GetMapping("/visitor")
    public String testVisitor() {
        
        // 1. Criamos nossa estrutura de objetos (o carrinho de compras)
        // Note que o tipo é da interface "ItemElemento"
        ItemElemento[] itens = new ItemElemento[] {
            new Livro(20.0, "123-ABC", "O Senhor dos Anéis"),
            new Livro(100.0, "456-DEF", "Design Patterns GoF"),
            new Dvd(15.0, "Matrix"),
            new Dvd(25.0, "O Poderoso Chefão")
        };

        String resultado = "<b>--- Visitor (Carrinho de Compras) ---</b><br><br>";

        // --- O TESTE 1: Operação "Calcular Preço" ---
        // 2. Criamos o Visitante da Operação 1
        CalculadorPrecoVisitor precoVisitor = new CalculadorPrecoVisitor();

        // 3. "Visitamos" cada item
        for (ItemElemento item : itens) {
            item.accept(precoVisitor);
        }
        
        resultado += "<b>Operação 1: Calcular Preço Total (Livros com 10% desconto)</b><br>";
        resultado += "Preço Total: R$ " + precoVisitor.getPrecoTotal() + "<br><br>";

        // --- O TESTE 2: Operação "Gerar Relatório" ---
        // 4. Criamos o Visitante da Operação 2 (sem modificar os itens)
        RelatorioVisitor relatorioVisitor = new RelatorioVisitor();

        // 5. "Visitamos" cada item novamente
        for (ItemElemento item : itens) {
            item.accept(relatorioVisitor);
        }

        resultado += "<b>Operação 2: Gerar Relatório de Itens</b><br>";
        resultado += relatorioVisitor.getRelatorio();

        return resultado;
    }

    /**
     * Demonstração do Padrão Factory Method (Criacional)
     * URL: http://localhost:8080/demo/factory-method?tipo=terra
     * URL: http://localhost:8080/demo/factory-method?tipo=mar
     */
    @GetMapping("/factory-method")
    public String testFactoryMethod(@RequestParam(defaultValue = "terra") String tipo) {
        
        Logistica fabrica;

        // 1. Decidimos qual FÁBRICA usar
        if ("mar".equals(tipo)) {
            fabrica = new LogisticaMaritima();
        } else {
            fabrica = new LogisticaTerrestre();
        }

        // --- O TESTE ---
        // 2. Chamamos a lógica de negócio na superclasse "Logistica".
        // O "planejarEntrega()" vai chamar o "criarTransporte()"
        // e a subclasse (Maritima ou Terrestre) vai decidir qual objeto criar.
        
        String resultado = "<b>--- Factory Method (Logística) ---</b><br><br>";
        resultado += "<b>Configurando para logística: " + tipo + "</b><br>";
        resultado += fabrica.planejarEntrega();

        return resultado;
    }
}