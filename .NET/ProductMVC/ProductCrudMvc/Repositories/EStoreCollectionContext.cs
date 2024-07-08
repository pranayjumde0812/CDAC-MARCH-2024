using Microsoft.EntityFrameworkCore;
using ProductCrudMvc.Models;
namespace ProductCrudMvc.Repositories
{
    public class EStoreCollectionContext : DbContext
    {
        public DbSet<Product> Products { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string connectionString = @"server=localhost; port=3306; username=root; password=1311; database=ecommerce";
            optionsBuilder.UseMySQL(connectionString);
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Product>(entity =>
            {
                entity.HasKey(e => e.Id);
                entity.Property(e => e.Title).IsRequired();
                entity.Property(e => e.Description).IsRequired();
                entity.Property(e => e.UnitPrice).IsRequired();
                entity.Property(e => e.ImageUrl).IsRequired();
                entity.Property(e => e.Quantity).IsRequired();
            });

            modelBuilder.Entity<Product>().ToTable("products");
        }
    }
}
