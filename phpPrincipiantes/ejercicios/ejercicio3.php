<form action="" method="post">
    <label for="numeroTabla">Tabla de multiplicar</label>
    <input type="text" name="numero" id="numero" size="30" placeholder="Ingrese el número de la tabla"><br>
    <input type="submit" value="Mostrar tabla">
</form>

<?php

function mostrarTabla(){
    if(isset($_POST["numero"])){
        $numeroTabla=$_POST["numero"];
        for($i=1; $i<=12 ; $i++){
            echo  $numeroTabla . "x" . $i . " = " . ($numeroTabla*$i) . "<br>";
        }
    }
}
echo mostrarTabla();

?>