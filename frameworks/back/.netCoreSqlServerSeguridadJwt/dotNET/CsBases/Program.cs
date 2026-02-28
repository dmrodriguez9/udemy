//Seccion 2 
class Program
{
    static void Main()
    {
        //Creando un objeto de la clase producto
        var laptop= new Product("Laptop", 1200);
        WriteLine(laptop.GetDescription());
        var soporte = new ServiceProduct("Soporte técnico", 300, 300);
        Write(soporte.GetDescription());
    }
}