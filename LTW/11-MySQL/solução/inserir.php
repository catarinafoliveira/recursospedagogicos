<?php
	function getMarcaId($ligacao,$marca){
		$consulta_marca = "SELECT mc_id FROM marca WHERE mc_marca = '" . $marca ."'";
		$resultado_marca = mysqli_query($ligacao,$consulta_marca);
		if($resultado_marca->num_rows > 0){
			$row = $resultado_marca->fetch_assoc();
			return $row["mc_id"];
		} else {
			return -1;
		}
	}
	
	function getModeloId($ligacao,$modelo){
		$consulta_modelo = "SELECT md_id FROM modelo WHERE md_modelo = '" . $modelo ."'";
		$resultado_modelo = mysqli_query($ligacao,$consulta_modelo);
		if($resultado_modelo->num_rows > 0){
			$row = $resultado_modelo->fetch_assoc();
			return $row["md_id"];
		} else {
			return -1;
		}
	}

	
	
	$servidor = 'localhost';
	$user = 'root';
	$ligacao = mysqli_connect($servidor,$user) or die('Sem ligação');
	mysqli_select_db($ligacao,'carros') or die('Sem tabela');
	
	$mc_id = getMarcaId($ligacao, $_POST['marca']);
	$md_id = getModeloId($ligacao, $_POST['modelo']);
	
	if($mc_id != -1 && $md_id != -1){
		echo "Veiculo ja existente";
	} else {
		// upload da foto
		$target_dir = "./fotos/";
		$target_file = $target_dir . basename($_FILES["fileToUpload"]["name"]);
		$uploadOk = 1;
		$imageFileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
		
		// Check if $uploadOk is set to 0 by an error
		if ($uploadOk != 0) {
			if (!move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $target_file)) {
				echo "Sorry, there was an error uploading your file.";
			}
		}
	
		if($mc_id == -1) {
			$inserir_marca = "INSERT INTO marca(mc_marca) VALUES('".$_POST['marca']."')";
			if ($ligacao->query($inserir_marca) === TRUE) {
				$mc_id = getMarcaId($ligacao, $_POST['marca']);
			} else {
				echo "Error: " . $ligacao . "<br>" . $ligacao->error;
			}
		}
		$inserir_modelo = "INSERT INTO modelo(md_modelo, md_cilindrada, md_marca, md_fotografia) VALUES('".$_POST['modelo']."',".$_POST['cilindrada'].",".$mc_id.",'".$_FILES["fileToUpload"]["name"]."')";
		if ($ligacao->query($inserir_modelo) === TRUE) {
				echo "Veiculo criado com sucesso";
		} else {
			echo "Error: " . $ligacao . "<br>" . $ligacao->error;
		}
	}
	include("carros.php");
?>

