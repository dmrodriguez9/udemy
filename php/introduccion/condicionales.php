<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Condicionales</title>
</head>
<body>
    <h1>******PHP******</h1>
    <h2>Condicionales</h2>
    <?php
    $n1=20;
    $n2=20;

    //if
    if($n1>$n2){
        echo "n1 es mayor a n2";
    }else if($n1==$n2)
    {
        echo "n1 es igual n2";
    }
    else{
        echo "n2 es mayor a n1";
    }
    echo "<br>";

    //swith case
    $curso="php";
    switch($curso){
        case "php":{
            echo "Seleccionaste el curso de php";
            break;
        }
        case "java":{
            echo "Seleccionaste el curso de java";
            break;
        }
        case "python":{
            echo "Seleccionaste el curso de python";
            break;
        }
        default:{
            echo "Error el curso no existe";
            break;
        }

    }

    ?>
    
</body>
</html>