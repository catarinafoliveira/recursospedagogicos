<?php
	$datahora = gmdate('d/m/Y H:i:s T', time());
	$email = $_POST["email"];
	$passwd = $_POST["password"];
	
	echo "<b>=== Tentativa de login ===</b><br>";
	echo "<b>Data/hora:</b> " . $datahora . "<br>";
	echo "<b>Email:</b> " . $email . "<br>";
	echo "<b>Password:</b> " . $passwd . "<br>";
	echo "<b>A hash MD5 desta password é: </b>" . md5($passwd);
?>