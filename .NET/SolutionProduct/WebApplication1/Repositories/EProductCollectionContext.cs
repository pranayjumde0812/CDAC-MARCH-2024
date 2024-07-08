using Microsoft.EntityFrameworkCore;
using WebApplication1.Models;

namespace WebApplication1.Repositories
{
    public class EProductCollectionContext : DbContext
    {
        public DbSet<Product> Products { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string conStr = @"server=localhost; port=3306; username=root; password=1311; database=db";
            optionsBuilder.UseMySQL(conStr);
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);

            modelBuilder.Entity<Product>(entity =>
            {
                entity.HasKey(p => p.Id);
                entity.Property(p => p.Title).IsRequired();
                entity.Property(p => p.Description).IsRequired();
                entity.Property(p => p.UnitPrice).IsRequired();
                entity.Property(p => p.ImageUrl).IsRequired();
                entity.Property(p => p.Quantity).IsRequired();
            });

            modelBuilder.Entity<Product>().ToTable("products");
        }
    }
}
