<?php

// como é PHP tem de ser aberto no servidor (Ex: XAMPP) com localhost e não como ficheiro local

function mostraidade($pess){ 
	foreach($pess as $p => $i){
		echo $p . " tem " . $i . " anos de idade</br>";
	}
}

echo "<h1>Exercicios PHP</h1>";
echo "<ol>";
echo "<li> exercício com 1º formulario: <a href='login.html'>login.html</a> processado com process_login.php";
echo "<li> exercício com 2º formulario: <a href='comentario.html'>comentario.html</a> processado com process_comentario.php";
echo "<li>";
$color = array('white', 'green', 'red');
foreach($color as $c){
	echo $c.", ";
}
echo "</li>";


echo "<li>";
$color = array('white', 'green', 'red');
echo "<ul>";
foreach($color as $c){
	echo "<li>".$c."</li>";
}
echo "</ul>";
echo "</li>";

echo "<li>";
$ceu = array( "Italy"=>"Rome", "Luxembourg"=>"Luxembourg", "Belgium"=> "Brussels", "Denmark"=>"Copenhagen", "Finland"=>"Helsinki", "France" => "Paris",  "Slovakia"=>"Bratislava",  "Slovenia"=>"Ljubljana",  "Germany" =>    "Berlin",    "Greece"    =>    "Athens",    "Ireland"=>"Dublin", "Netherlands"=>"Amsterdam",  "Portugal"=>"Lisbon",  "Spain"=>"Madrid", "Sweden"=>"Stockholm", "United Kingdom"=>"London", "Cyprus"=>"Nicosia", "Lithuania"=>"Vilnius", "Czech Republic"=>"Prague", "Estonia"=>"Tallin", "Hungary"=>"Budapest", "Latvia"=>"Riga", "Malta"=>"Valetta", "Austria" => "Vienna", "Poland"=>"Warsaw");
// ordenação de arrays: https://www.php.net/manual/en/array.sorting.php
natcasesort($ceu);
foreach($ceu as $pais => $capital){
	echo "The capital of ".$pais." is ".$capital."</br>";
}
echo "</li>";

echo "<li>";
$pessoas = array("Sophy"=>"31","Jack"=>"41","Will"=>"39","Ramesh"=>"40");
echo "<ol>";

echo "<li>";
natsort($pessoas);
mostraidade($pessoas);
echo "</li>";

echo "<li>";
ksort($pessoas);
mostraidade($pessoas);
echo "</li>";

echo "<li>";
arsort($pessoas);
mostraidade($pessoas);
echo "</li>";

echo "<li>";
krsort($pessoas);
mostraidade($pessoas);
echo "</li>";

echo "</ol>";
echo "</li>";

echo "<li> exercício com 3º formulario: <a href='ordenar.html'>ordenar.html</a> processado com process_ordenar.php";

echo "</ol>";

?>