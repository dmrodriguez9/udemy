var nombre, apellido, edad;
var personas = new Array();

class persona
{
   constructor(nombre, apellido, edad)
   {
     this.nombre=nombre;
     this.apellido=apellido;
     this.edad=edad;
   }

}

ingresarDatos();

function ingresarDatos()
{
    nombre=prompt("Ingrese su nombre: ");
    apellido=prompt("Ingrese su apellido: ");
    edad=parseInt(prompt("Ingrese su edad: "));
    mostrarDatos();
}

function mostrarDatos() 
{
    var objpersona= new persona(nombre, apellido, edad);
    personas.push(objpersona);
    for( var i=0; i<personas.length; i++)
    {
        console.log(personas[i]);
    }
}

