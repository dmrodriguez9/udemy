<?php

$server="localhost";
$user="root";
$password="";
$baseDeDatos="programacion";

$con= new mysqli ($server,$user,$password,$baseDeDatos);

if($con->connect_error){
    echo "Error en la conexión";
}else{
    //echo "Conexión exitosa";
}



?>