<?php
	$bdservidor = 'localhost';
	$bduser = 'root';
	$database = 'portugal';
	$ligacao = mysqli_connect($bdservidor,$bduser) or die('Sem ligação');
	mysqli_select_db($ligacao,$database) or die('Sem bd');
	

	if(!empty($_SERVER['QUERY_STRING'])){
		$queries = array();
		parse_str($_SERVER['QUERY_STRING'], $queries);
		$distrito = $queries['distrito'];
	} else {
		$distrito = "";
	}
	
	
	echo "<option value='' id='empty' disabled selected>= Escolher =</option>";
	if($distrito!=""){
		$consulta = "SELECT * FROM concelho WHERE distrito_id=".$distrito;
		$resultado = mysqli_query($ligacao,$consulta);
		if($resultado->num_rows > 0){
			while($row = $resultado->fetch_assoc()) {
				echo "<option value='".$row["id"]."'>".$row["name"]."</option>";
			}
		} 
	}
?>