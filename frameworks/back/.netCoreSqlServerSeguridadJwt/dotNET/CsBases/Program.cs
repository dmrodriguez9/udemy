//Seccion 2 
using System.Threading.Tasks;

class Program
{
    static async Task Main()
    {
        //Creando un objeto de la clase producto
        var laptop= new Product("Laptop", 1200);
        //WriteLine(laptop.GetDescription());
        var soporte = new ServiceProduct("Soporte técnico", 300, 300);
        //WriteLine(soporte.GetDescription());
        var product = new Product("Mouse Gamer",300);
        var productDto= ProductAdapter.ToDto(product);
        //WriteLine($"{productDto.Name}-{productDto.Price:C}-Código:{productDto.Code}");

        //Inyeccion de dependencias
        ILabelService labelService= new LabelService();
        var manager= new ProductManager(labelService);
        var monitor = new Product("Monitor",100);
        var installation = new ServiceProduct("Instalación de monitor",20,30);
        //manager.PrintLabel(monitor);
        //manager.PrintLabel(installation);
        var firsProduct = await new ProductRepository().GetProduct(1);
        firsProduct.Description ="Esta es la descripcion del primer producto";
        AttributeProcessor.ApplyUpperCase(firsProduct);
        WriteLine ($"{firsProduct.Name} - {firsProduct.Price} - {firsProduct.Description}");

    }
}