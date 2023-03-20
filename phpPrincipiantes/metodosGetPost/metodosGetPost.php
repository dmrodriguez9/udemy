<!--<form action="" method="get">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" placeholder="Ingrese su nombre"><br>
    <br><label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" placeholder="Ingrese su apellido"><br><br>
    <input type="submit" value="Enviar">
</form>-->

<form action="" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" placeholder="Ingrese su nombre"><br>
    <br><label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" placeholder="Ingrese su apellido"><br><br>
    <input type="submit" value="Enviar">
</form>

<?php
    //Para tomar las variables de la url hacemos uso del GET
    //echo "El nombre ingresado fue: " . $_GET["nombre"] . ", y el apellido fue: " . $_GET["apellido"];
    //Para tomar las variables hacemos del 
    if(isset($_POST["nombre"]) && $_POST["apellido"]){
        echo "El nombre ingresado fue: " . $_POST["nombre"] . ", y el apellido fue: " . $_POST["apellido"];
    }
?>
