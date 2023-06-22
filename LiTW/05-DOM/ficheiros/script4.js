document.getElementById("corpo").addEventListener(
	"click",
	function(){
		document.getElementById("corpo").style.backgroundColor="grey";
	})

document.getElementById("btn").addEventListener(
	"click",
	function(){
		document.getElementById("result").innerHTML = new Date();
	})