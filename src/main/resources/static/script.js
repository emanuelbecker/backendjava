// Espera o HTML carregar antes de rodar o script
document.addEventListener("DOMContentLoaded", function() {
    
    // Pega todos os links <a> de dentro do menu
    const links = document.querySelectorAll(".sidebar a");
    
    // Pega a <div> onde vamos mostrar o resultado
    const resultadoDiv = document.getElementById("resultado");

    // Adiciona um "escutador de clique" para cada link do menu
    links.forEach(link => {
        link.addEventListener("click", function(event) {
            // Previne o link de tentar navegar para "#"
            event.preventDefault(); 
            
            // Pega o endpoint do atributo "data-endpoint"
            // Ex: "singleton" ou "strategy?tipo=pix"
            const endpoint = this.getAttribute("data-endpoint");

            // Define um texto de "carregando"
            resultadoDiv.innerHTML = "Carregando...";

            // --- A MÁGICA ACONTECE AQUI ---
            // Usamos a API 'fetch' para chamar nosso back-end
            // O '/demo/' vem do nosso 'context-path' no application.properties
            fetch(`/demo/${endpoint}`)
                .then(response => {
                    // Pega o resultado como texto (pois nosso back-end envia HTML)
                    return response.text(); 
                })
                .then(data => {
                    // Coloca o HTML recebido do back-end dentro da <div>
                    resultadoDiv.innerHTML = data;
                })
                .catch(error => {
                    // Se der erro (ex: servidor caiu)
                    console.error("Erro ao buscar:", error);
                    resultadoDiv.innerHTML = "Erro ao carregar o resultado. Veja o console (F12).";
                });
        });
    });
});