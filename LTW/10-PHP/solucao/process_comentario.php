<?php
	$datahora = gmdate('d/m/Y H:i:s T', time());
	$nome = $_POST["nome"];
	$email = $_POST["email"];
	$seccao = $_POST["seccao"];
	$nrvezes = $_POST["vezes"];
	$quando = $_POST["tempo"];
	$problema = $_POST["comentario"];
	
	echo "<b>=== Comentario submetido ===</b><br>";
	echo "Dados Pessoais<br>";
	echo "<b>Data/hora:</b> " . $datahora . "<br>";
	echo "<b>Nome:</b> " . $nome . "<br>";
	echo "<b>Email:</b> " . $email . "<br>";
	echo "<br>Feedback<br>";
	echo "<b>Secção:</b> " . $seccao . "<br>";
	echo "<b>Nr. vezes problema:</b> " . $nrvezes . "<br>";
	echo "<b>Feedback enviado:</b> " . $quando . "<br>";
	echo "<br>Descrição do problema<br>";
	echo $problema;
?>