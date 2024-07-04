using e_commerce.Models;
using Microsoft.EntityFrameworkCore;

namespace e_commerce.Repositories
{
    public class EStoreCollectionContext : DbContext
    {
        public DbSet<Product> Products { get; set; }


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string connectionstring = @"server=localhost;port=3306;username=root;password=1311;database=ecommerce";
            optionsBuilder.UseMySQL(connectionstring);
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            //Set Mapping of Table with POCO
            //Relational        instance: Table
            //Object Oriented   instance: POCO Class
            base.OnModelCreating(modelBuilder);

            modelBuilder.Entity<Product>(entity =>
            {
                entity.HasKey(e => e.Id);
                entity.Property(e => e.Title).IsRequired();
                entity.Property(e => e.Description).IsRequired();
                entity.Property(e => e.UnitPrice).IsRequired();
                entity.Property(e => e.ImageUrl);
                entity.Property(e => e.Quantity).IsRequired();
            });

            modelBuilder.Entity<Product>().ToTable("products");
        }

    }
}
