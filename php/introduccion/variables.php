<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Variables</title>
</head>
<body>
    <h1>PHP</h1>
    <h2>Variables</h2>
    <?php
        /*echo("Hola mundo"); //mensajes en pantalla con o sin parentesis lo que importa es las comillas
        echo "<span>Mi primer Span</span>"; //salto de línea
        print "Escrito por print"; //otra forma de mostrar mensajes
        //Variables
        echo "<br>";
        $nombre="Ayrton"; //Creacion de variables para ello debemos anteponer el signo de $
        echo "Mi nombres es: ".$nombre; //Para concatenar se usa el . (Punto)
        echo "<br>";
        echo "Mi nombres es: $nombre <br>"; //Otra forma de mostrar una variable con echo
        echo gettype($nombre); //Devuelve el tipo de la variable
        //Variables constantes
        define('edad',10);
        echo "<br>".edad;*/

        //Variables globales
        $mascota ="Perro";
        function mostrarMiMascota()
        {
            global $mascota; //Propiedad global
            echo "Mi mascota es: $mascota";
        }
        mostrarMiMascota(); //llamado de la funcion
        $a=10;
        $b=10;
        function sumar()
        {
            $GLOBALS["r"]=$GLOBALS["a"]+$GLOBALS["b"]; //propiedad adicional para variables globales "GLOBALS"
        }
        sumar();
        echo "<br> La sumas es: ".$r;

    ?>
    
</body>
</html>