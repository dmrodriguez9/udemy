<form action="" method="post">
    <label for="kilometros">Kilometros:</label>
    <input type="text" name="kilometros" id="kilometros" placeholder="Ingrese la cantidad"><br>
    <input type="submit" value="Convertir">

</form>

<?php

function convertirKMAMetros(){
    if(isset($_POST["kilometros"])){
        $kilometros=$_POST["kilometros"];
        $convertir=$kilometros*1000;
        echo "La cantidad ingresada " . $kilometros . " en km" ." convertida a metros es: " . $convertir;
    }   
}
echo convertirKMAMetros();


?>