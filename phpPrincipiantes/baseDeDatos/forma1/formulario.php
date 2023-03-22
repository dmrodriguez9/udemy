<form action="" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" placeholder="Ingrese su nombre"><br><br>
    <label for="apellido">Apellido:</label>
    <input type="text" name="apellido" placeholder="Ingrese su apellido"><br><br>
    <label for="edad">Edad: </label>
    <input type="text" name="edad" placeholder="Ingrese su edad"><br><br>
    <input type="submit" value="Guardar datos">
</form>

<?php

if(!empty($_POST["nombre"])){
    include("bd.php");

    echo "<br><br>";
    //if(isset($_POST["nombre"]) && isset($_POST["apellido"]) && isset($_POST["edad"])){
        $nombre=$_POST["nombre"];
        $apellido=$_POST["apellido"];
        $edad=$_POST["edad"];
        $consulta_sql= "INSERT INTO estudiantes (nombre,apellido,edad) VALUES ('$nombre','$apellido',$edad)";
        $query_sql=mysqli_query($con,$consulta_sql);

        //var_dump($query_sql);
        mysqli_close($con);
//}
}




?>