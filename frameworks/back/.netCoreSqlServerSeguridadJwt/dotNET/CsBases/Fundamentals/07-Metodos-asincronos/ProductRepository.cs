public class ProductRepository
{
    public async Task<Product> GetProduct(int id)
    {
        //Obtener de una base de datos, una llamada de 
        // una API externa 
        // o podria ser de un archivo
        WriteLine("Buscando un producto...");
        await Task.Delay(2000);
        return new Product("Producto simulado", 500);
    }
}