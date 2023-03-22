<?php

include("bd.php");

echo "<br><br>";

$consulta_sql= "DELETE FROM estudiantes WHERE id=4";
$query_sql=$con->query($consulta_sql);

var_dump($query_sql);

$con->close();

?>