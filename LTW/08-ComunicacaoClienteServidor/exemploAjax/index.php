<?php
	$bdservidor = 'localhost';
	$bduser = 'root';
	$database = 'portugal';
	$ligacao = mysqli_connect($bdservidor,$bduser) or die('Sem ligação');
	mysqli_select_db($ligacao,$database) or die('Sem bd');
?>
<html>
	<head>
		<title>Exemplo AJAX</title>
	</head>
	<body>
		<form>
			<select id="selectDistrito" name="distrito" onchange="showConcelhos(this.value)">
				<option id="empty" value="" disabled selected>= Escolher =</option>
				<?php
				$consulta = "SELECT * FROM distritos";
				$resultado = mysqli_query($ligacao,$consulta);
				if($resultado->num_rows > 0){
					while($row = $resultado->fetch_assoc()) {
						echo "<option value='".$row["id"]."'>".$row["name"]."</option>";
					}
				} 
				?>
			</select>
			<select id="selectConcelho" name="concelho" disabled onchange="showFreguesias(this.value)">
				<option id="emptyC" value="" disabled selected>= Escolher =</option>
			</select>
			<select id="selectFreguesia" name="freguesia" disabled onchange="showInfoFreguesia(this.value)">
				<option id="emptyF" value="" disabled selected>= Escolher =</option>
			</select>
			<div id="info">
			
			</div>
		</form>
		<script>	
			showConcelhos("");
			showFreguesias("");
			document.getElementById("emptyC").selected=true;
			document.getElementById("emptyF").selected=true;
			
			function showConcelhos(str){
				var xhttp;
				if(str==""){
					return;
				}
				xhttp = new XMLHttpRequest();
				xhttp.onreadystatechange = function(){
					if(this.readyState == 4 && this.status == 200){
						document.getElementById("selectConcelho").disabled=false;
						document.getElementById("selectConcelho").innerHTML=this.responseText;
						document.getElementById("emptyC").selected=true;
					}
				};
				xhttp.open("GET","getConcelhos.php?distrito="+str, true);
				xhttp.send();
			}
			
			
			function showFreguesias(str){
				var xhttp;
				if(str==""){
					return;
				}
				xhttp = new XMLHttpRequest();
				xhttp.onreadystatechange = function(){
					if(this.readyState == 4 && this.status == 200){
						document.getElementById("selectFreguesia").disabled=false;
						document.getElementById("selectFreguesia").innerHTML=this.responseText;
						document.getElementById("emptyF").selected=true;
					}
				};
				xhttp.open("GET","getFreguesias.php?concelho="+str, true);
				xhttp.send();
			}
			
			function showInfoFreguesia(str){
				var xhttp;
				if(str==""){
					return;
				}
				xhttp = new XMLHttpRequest();
				xhttp.onreadystatechange = function(){
					if(this.readyState == 4 && this.status == 200){
						console.log("response: " + this.responseText + ".");
						document.getElementById("info").innerHTML=this.responseText;
					}
				};
				xhttp.open("GET","getInfoFreguesia.php?freguesia="+str, true);
				xhttp.send();
			}
		</script>
	</body>
</html>