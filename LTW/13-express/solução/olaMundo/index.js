const http = require('http'); // Carrega o módulo HTTP
const server = http.createServer( // Cria uma instância do servidor
	// Enviar uma resposta HTTP com conteúdo "Ola mundo":
	function(request, response) {
		response.writeHead(200,{'Content-Type':'text/html'}); // Inicia a resposta como página HTML
		response.write('<html><body><h1>Ola Mundo</h1></body></html>');
		response.end(); // Termina a resposta
	}
);
server.listen(3000); // O servidor escuta na porta 3000
console.log('Servidor a correr na porta 3000');