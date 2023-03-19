<?php

//el foreach para recorrer arrays

$arrayNombres= array("Danny", "Mishell", "Daniel", "Cynthia");
print_r ($arrayNombres);
echo "<br><br>";
var_dump($arrayNombres);

//Recorriendo los valores

foreach($arrayNombres as $valor){
    echo "<br>" . $valor;
}

echo "<br>";

//Recorriendo las claves con sus respectivos valores

foreach($arrayNombres as $clave => $valor){
    echo "<br>" . $clave . " " . $valor;
}
?>