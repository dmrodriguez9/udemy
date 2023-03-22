<?php

include("bd.php");

echo "<br><br>";

$consulta_sql= "UPDATE estudiantes SET nombre='Mishell', apellido='Díaz', edad=23 WHERE id=3";
$query_sql=$con->query($consulta_sql);

var_dump($query_sql);

$con->close();

?>