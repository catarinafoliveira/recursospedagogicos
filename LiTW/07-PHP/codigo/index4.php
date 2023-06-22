<?php
	$servidor = "localhost";
	$user = "root";
	
	$ligacao = mysqli_connect($servidor,$user) or die("Sem ligação");
	mysqli_select_db($ligacao, "carros") or die("Sem DB");
	$consulta = "SELECT * FROM marca";
	$resultado = mysqli_query($ligacao,$consulta);
	if($resultado->num_rows > 0){
		while($row = $resultado->fetch_assoc()){
			echo "id: " . $row["mc_id"] . " - Marca: " . $row["mc_marca"] . "<br>";
		}
	} else {
		echo "0 results";
	}
?>


