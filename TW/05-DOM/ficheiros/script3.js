window.onload = function(){
	let resultado = document.getElementById("result");
	let botao = document.getElementById("btn");
	botao.onclick = function(){
		resultado.innerHTML = new Date();
	}
}