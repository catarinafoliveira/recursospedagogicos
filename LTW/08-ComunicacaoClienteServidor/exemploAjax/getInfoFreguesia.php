<?php
	$bdservidor = 'localhost';
	$bduser = 'root';
	$database = 'portugal';
	$ligacao = mysqli_connect($bdservidor,$bduser) or die('Sem ligação');
	mysqli_select_db($ligacao,$database) or die('Sem bd');
	

	if(!empty($_SERVER['QUERY_STRING'])){
		$queries = array();
		parse_str($_SERVER['QUERY_STRING'], $queries);
		$freguesia = $queries['freguesia'];
	} else {
		$freguesia = "";
	}
?>
<table>
	<tr><th>População</th><th>Rural</th><th>Litorâneo</th></tr>
<?php
	$imgSim = "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Green-checkmark.svg/289px-Green-checkmark.svg.png?20181024211158' width=20px/>";
	$imgNao = "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/X_mark.svg/787px-X_mark.svg.png' width=20px/>";
	
	if($freguesia!=""){
		$consulta = "SELECT * FROM populacaoresidentefreguesia WHERE Freguesia_FR=".$freguesia;
		
		$resultado = mysqli_query($ligacao,$consulta);
		if($resultado->num_rows > 0){
			while($row = $resultado->fetch_assoc()) {
				echo "<tr><td>";
				echo $row["População"];
				echo "</td><td>";
				if($row["Rural"]=="S"){
					echo $imgSim;
				} else {
					echo $imgNao;
				}
				echo "</td><td>";
				if($row["Litorâneo"]){
					echo $imgSim;
				} else {
					echo $imgNao;
				}
				echo "</td></tr>";
			}
		} 
	}
?>
</table>