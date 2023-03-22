<?php

include("bd.php");

echo "<br><br>";

$consulta_sql= "SELECT * FROM estudiantes";
$query_sql=mysqli_query($con,$consulta_sql);

while($resultado=mysqli_fetch_array($query_sql)){
    echo "<br>";
    //var_dump($resultado);
    echo "Id: " . $resultado["id"] . " " . "Nombre: " . $resultado["nombre"] . " " . "Apellido: " . $resultado["apellido"] . " " . "Edad: " . $resultado["edad"];
}

mysqli_close($con);

?>
