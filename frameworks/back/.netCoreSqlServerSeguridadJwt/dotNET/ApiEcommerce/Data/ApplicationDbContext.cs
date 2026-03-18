//Nos permite mapear las clases de c# a tablas dentro de la base de datos 
//y controlar las operaciones sobre ellas

using System.ComponentModel;
using Microsoft.EntityFrameworkCore;

public class ApplicationDbContext: DbContext
{
    public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options): base(options)
    {
        
    }
    public DbSet<Category> Categories {get; set;}
}