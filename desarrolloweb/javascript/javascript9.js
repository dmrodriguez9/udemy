
var cantidadNumeros,pares;
var numerosPares = new Array();
cantidadNumeros= parseInt(prompt("Ingrese un numero, y posteriormente mostrar los numeros pares: "));


for(var i=0; i<=cantidadNumeros; i++)
{
     if(i%2==0)
     {
       pares=1;
       numerosPares[i]=i;
     }
}

if(pares==1)
{
    console.log("Los Números pares son: "+numerosPares);
    alert("Los Números pares son: "+numerosPares);
}





