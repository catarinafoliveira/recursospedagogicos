<?php
	$servidor = 'localhost';
	$user = 'root';
	
	$ligacao = mysqli_connect($servidor,$user) or die('Sem ligação');
	mysqli_select_db($ligacao,'carros') or die('Sem tabela');
	$consulta = 'SELECT mc_marca, md_modelo, md_cilindrada, md_fotografia FROM marca, modelo WHERE mc_id = md_marca';
	$resultado = mysqli_query($ligacao,$consulta);
	if($resultado->num_rows > 0){
		echo "<table><tr><th>Marca</th><th>Modelo</th><th>Cilindrada</th><th>Fotografia</th></tr>";
		while($row = $resultado->fetch_assoc()) {
			echo "<tr><td>". $row["mc_marca"] . "</td><td>" .$row["md_modelo"]."</td><td>".$row["md_cilindrada"]."</td><td><img src='fotos/".$row["md_fotografia"]."' width='100' height='50'></td></tr>";
		}
		echo "</table>";
	} else {
		echo "Base de dados de carros vazia";
	}
?>

