let formulario = document.getElementById("frm");
frm.addEventListener("submit",function(event){
	let passwd1 = document.getElementById("pass1");
	let passwd2 = document.getElementById("pass2");
	if(passwd1.value != passwd2.value) {
		alert("Passwords diferentes");
		event.preventDefault();
	}
})