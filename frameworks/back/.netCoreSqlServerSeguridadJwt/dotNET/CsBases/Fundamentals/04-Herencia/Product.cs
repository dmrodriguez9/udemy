//Clases e interfaces
using CsBases.Fundamentals;

public class Product : IProduct
{
    public int Id {get; set;}
    [UpperCase]
    public string Name{get; set;}
    [UpperCase]
    public string? Description  {get; set;}
    public decimal Price { get; set;}
    public DateTime CreateAT {get; set;}
    public Guid UniqueCode {get; set;}

    //Constructor
    public Product (string name, decimal price)
    {
        Name= name;
        Price = price;
        CreateAT= DateTime.Now;
        UniqueCode= Guid.NewGuid();
    }
    

    //Metodos 

    public void ApplyDiscount (decimal percentage)
    {
        var discountAmount= Price * (percentage/100);
        Price -= discountAmount;
    }

    public virtual string GetDescription()  //virtual; nos servira para hacer herencia
    {
        return $"{Name} - {Price:C}";
    }
 
}

//Nueva Class //Herencia

class ServiceProduct: Product
{
    public int DurationInDays{get; set;}

    public ServiceProduct(string name, decimal price, int duration): base(name, price)
    {
        DurationInDays= duration;
    }

    //Metodo
    public override string GetDescription()
    {
        return $"{base.GetDescription()} - Duración: {DurationInDays} días ";
    }
}