//Nos permite mapear las clases de c# a tablas dentro de la base de datos 
//y controlar las operaciones sobre ellas

using System.ComponentModel;
using Microsoft.EntityFrameworkCore;

//"Esta clase representa mi base de datos"
public class ApplicationDbContext: DbContext
{
    //Construtor, permite que ASP.NET Core le pase la configuración (cadena de conexión).
    public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options): base(options)
    {
        
    }
    public DbSet<Category> Categories {get; set;}
}