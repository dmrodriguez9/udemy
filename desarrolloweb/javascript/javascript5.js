
var mensaje= "que lo pases muy bien :)";  // Variable global 
function saludar(nombre, edad)
{
    var frase= "Hola " +nombre+ ", buenos días" + " Feliz " +edad+ " cumpleaños, "; //Variable local
    frase= frase+mensaje;
    return frase;
}
var cadena= saludar("Lizbeth", 23);
console.log(cadena);