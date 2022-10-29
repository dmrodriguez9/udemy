
var numero1, numero2, operacion, resultado;

function menu()
{
    operacion=parseInt(prompt("1.- Suma \n" + "2.- Resta \n" + "3.- Multiplicación \n"+  
    "4.- Division \n" + "Escriba la operacion para poder realizarla: " ));
    efectuarOperaciones(operacion);
}

menu();

function efectuarOperaciones(operacion)
{
    if(operacion==1)
    {
        numero1=parseFloat(prompt("Ingrese el primer número: "));
        numero2=parseFloat(prompt("Ingrese el segundo número: "));
        sumar();

    }else if( operacion == 2)
    {
        numero1=parseFloat(prompt("Ingrese el primer número: "));
        numero2=parseFloat(prompt("Ingrese el segundo número: "));
        restar();

    }else if(operacion==3)
    {
        numero1=parseFloat(prompt("Ingrese el primer número: "));
        numero2=parseFloat(prompt("Ingrese el segundo número: "));
        multiplicar();
    }
    else if (operacion==4)
    {
        numero1=parseFloat(prompt("Ingrese el primer número: "));
        numero2=parseFloat(prompt("Ingrese el segundo número: "));
        dividir();
    }
}



function sumar()
{
    resultado= numero1+numero2;
    alert("El resultado de sumar los numeros " + numero1 +" + "+ numero2 +" es: " +resultado);
    console.log("El resultado de sumar los numeros " + numero1 +" "+ numero2 +" es: " +resultado);
}

function restar()
{
    resultado=numero1-numero2;
    alert("El resultado de restar los numeros " + numero1 +" - "+ numero2 +" es: " +resultado);
    console.log("El resultado de restar los numeros " + numero1 +" "+ numero2 +" es: " +resultado);

}

function multiplicar()
{
    resultado=numero1*numero2;
    alert("El resultado de multiplicar los numeros " + numero1 +" * "+ numero2 +" es: " +resultado);
    console.log("El resultado de multiplicar los numeros " + numero1 +" "+ numero2 +" es: " +resultado);
}

function dividir()
{
    if(numero1==0 || numero2==0)
    {
        document.write("La division para 0 no se puede realizar");
    }
    else
    {
        resultado=numero1/numero2;
        alert("El resultado de dividir los numeros " + numero1 +" / "+ numero2 +" es: " +resultado);
        console.log("El resultado de dividir los numeros " + numero1 +" "+ numero2 +" es: " +resultado);
    }
   
}
