<?php

include("bd.php");

echo "<br><br>";

$consulta_sql= "SELECT * FROM estudiantes";
$query_sql=$con->query($consulta_sql);

while($resultado=$query_sql->fetch_assoc()){
    echo "<br>";
    //var_dump($resultado);
    echo "Id: " . $resultado["id"] . " " . "Nombre: " . $resultado["nombre"] . " " . "Apellido: " . $resultado["apellido"] . " " . "Edad: " . $resultado["edad"];
}
$con->close();


?>
