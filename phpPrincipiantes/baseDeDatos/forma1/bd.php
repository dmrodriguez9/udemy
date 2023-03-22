<?php

$server="localhost";
$user="root";
$password="";
$baseDeDatos="programacion";

$con= mysqli_connect($server,$user,$password,$baseDeDatos);

if(!$con){
    echo "Error en la conexión";
}else{
    echo "Conexión exitosa";
}



?>