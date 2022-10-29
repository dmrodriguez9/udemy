
var numero1, numero2, numero3, resultado;

function ingresarDatos()
{
    numero1 = parseFloat(prompt("Ingrese un número: "));
    numero2 = parseFloat(prompt("Ingrese un segundo número: "));
    numero3 = parseFloat(prompt("Ingrese un tercer número: "));
    resultado = calcularMediaAritmetica();
    console.log("La media artimética es: "+resultado);
}
ingresarDatos();

function calcularMediaAritmetica()
{
   return (numero1+numero2+numero3)/3;
}