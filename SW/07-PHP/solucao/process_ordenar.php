<?php
	$dados = array("Sophy"=>"31","Jack"=>"41","Will"=>"39","Ramesh"=>"40");
	$ordem = $_POST["ordem"];
	$campo = $_POST["campo"];
	
	echo "Escolheu ordenar por ordem <b>" . $ordem . "</b> de <b>" . $campo . "</b>.<br><br>";
	
	if($ordem=="crescente"){
		if($campo=="nome"){
			ksort($dados);
		} else {
			asort($dados);
		}
	} else {
		if($campo=="nome"){
			krsort($dados);
		} else {
			arsort($dados);
		}
	}
	
	echo "<table>";
	echo "<tr><th>Nome</th><th>Idade</th></tr>";
	foreach ($dados as $n=>$i){
		echo "<tr><td>".$n."</td><td>".$i."</td></tr>";
	}
	echo "</table>";
?>