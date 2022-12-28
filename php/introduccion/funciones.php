<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/style.css">
    <title>Funciones</title>
</head>
<body>
    <h1>PHP</h1>
    <h2>Funciones</h2>
    <form action="funciones.php" method="post">
        <label for="numero2">Número 1:</label>
        <input type="text" name="num1" placeholder="Ingrese un número"> <!--El name es importante para php para poder capturar-->
        <br><label for="numero2">Número 2:</label>
        <input type="text" name="num2" placeholder="Ingrese un segundo número">
        <br><input type="submit" value="Calcular">
    </form>
    <?php
        function multiplicar($n1,$n2){
            return $n1*$n2;
        }
        function validarNumeros($n1,$n2){
            if(is_numeric($n1) && is_numeric($n2)){  //is_numeric un método que permite verificar si lo ingresado es un número
                return true;
            }
            else{
                return false;
            }
        }
        function mostrarError(){
            echo "<span class='error'>Ingrese solo números</span>";
        }
        function validarCampos(){
            if(isset($_POST["num1"]) && isset($_POST["num2"])){
                $num1=$_POST["num1"];
                $num2=$_POST["num2"];
                if(validarNumeros($num1,$num2)){
                    echo "<p>".multiplicar($num1,$num2)."</p>";
                }
                else{
                    mostrarError();
                }
            }
        }
        validarCampos();

    ?>
    
</body>
</html>