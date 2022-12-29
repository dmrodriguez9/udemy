<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Arreglos</title>
</head>
<body>
    <h1>******PHP******</h1>
    <h2>Arreglos</h2>

    <?php
    //Creación de arrays

    $dias=array("Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo");
    //echo $dias[3];
    //var_dump($dias);  //Permite visualizar el contenido de un arreglo 
    //echo ("<br>");
    //print_r($dias);//Otra forma de visualizar el contenido de un arreglo

    //Devolver el penultimo elemento del array
    $posicion=count($dias)-2;
    //echo $dias[$posicion];

    //Ordenar los elementos de un array de forma ascendente
    //asort($dias);
    //print_r($dias);
    //echo("<br>");

    //Ordenar de forma descendente
    //arsort($dias);
    //print_r($dias);

    //Array asociativo

    $estudiante=array("Nombre: "=>"Mishelle","Edad: "=>"24");
    //echo "<br>";
    //echo ("Nombre del estudiante: ".$estudiante["Nombre: "]);

    //Mas propiedades en los arrays

    $dias=array("Lunes<br>","Martes<br>","Miercoles<br>","Jueves<br>","Viernes<br>","Sábado<br>","Domingo<br>");
    $mes=array("Enero<br>","Febrero<br>","Marzo<br>","Abril<br>","Mayo<br>","Junio<br>","Julio<br>","Agosto<br>","Septiembre<br>","Octubre<br>","Noviembre<br>","Diciembre<br>");
    $dividir=array_slice($dias,2); //La función separo, corto elementos y cuenta desde el 1
    print_r($dividir);
    echo "<br>";

    //Unir elementos
    $unir=array_merge($dias,$mes);
    print_r($unir);
    ?>
    
</body>
</html>