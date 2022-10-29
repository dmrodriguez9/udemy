
var valor=0;

while(valor<4)
{
    //codigo que se ejecuta de forma repetitiva hasta que ya no se cumpla la condición
    console.log("Valor es igual a "+valor);
    console.log("Valor es menor que 4, entonces le suma 1 a la variable valor");
    if(valor==2)
    {
        console.log("Ahora el valor es igual: "+valor +" y deseo parar la ejecución del bucle");
        break; //hace que se detenga el bucle
    }
    valor=valor+1;
}