//Seccion 2 
class Program
{
    static void Main()
    {
        //Console.WriteLine("Hello, World");
        //El Console configurado en CsBases.csproj
        //WriteLine("Hello, World");
        
        //Tipos Basicos
        //Declaracion explicita 
        int quantity= 5;
        string message= "Hello World";
        decimal price= 19.99m;
        //:C, Formatea un número como moneda (Currency) según la configuración regional del sistema.
        //WriteLine($"Cantidad: {quantity}, Saludo: {message}, Precio: {price:C}");

        //Declaración con var
        var gretting = "Hola";
        var percentage= 20.00m;
        //WriteLine($"Saludo: {gretting}, Porcentaje: {percentage:C}");

        //Creando un objeto de la clase producto
        var laptop= new Product("Laptop", 1200);
        WriteLine(laptop.GetDescription());
        var soporte = new ServiceProduct("Soporte técnico", 300, 300);
        Write(soporte.GetDescription());
    }
}