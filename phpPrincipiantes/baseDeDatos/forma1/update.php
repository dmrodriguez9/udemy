<?php

include("bd.php");

echo "<br><br>";

$consulta_sql= "UPDATE estudiantes SET nombre='Prueba' WHERE id=3";
$query_sql=mysqli_query($con,$consulta_sql);

var_dump($query_sql);

mysqli_close($con);

?>