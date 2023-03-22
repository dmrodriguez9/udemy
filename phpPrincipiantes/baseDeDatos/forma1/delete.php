<?php

include("bd.php");

echo "<br><br>";

$consulta_sql= "DELETE FROM estudiantes WHERE id=3";
$query_sql=mysqli_query($con,$consulta_sql);

var_dump($query_sql);

mysqli_close($con);

?>