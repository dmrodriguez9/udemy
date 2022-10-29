
var numero,suma=0,media;
var numeros = new Array();

function ingresarDatos()
{
    numero = parseInt(prompt("Ingrese un numero: "));
    calcularMediaArray();
}
ingresarDatos();

function calcularMediaArray()
{
    for( var i=0; i<=numero; i++)
    {
        numeros[i]=i;
        suma=suma+numeros[i];
        media=suma/numero;
    }
    console.log("La media a partir del número ingresado es: "+media);
    
}