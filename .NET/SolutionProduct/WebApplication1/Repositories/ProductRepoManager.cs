using WebApplication1.Models;

namespace WebApplication1.Repositories
{
    public class ProductRepoManager : IProductRepoManager
    {
        public void AddProduct(Product product)
        {
           using( var context = new EProductCollectionContext())
            {
                context.Products.Add(product);
                context.SaveChanges();
            }
        }

        public void DeleteProduct(int id)
        {
            using (var context = new EProductCollectionContext())
            {
                Product product = context.Products.Find(id);
                context.Products.Remove(product);
                context.SaveChanges();
            }
        }

        public Product GetProductById(int id)
        {
            using (var context = new EProductCollectionContext())
            {
                Product product = context.Products.Find(id);
                return product;
            }
        }

        public List<Product> GetProducts()
        {
            using (var context = new EProductCollectionContext())
            {
                var products= from product 
                              in context.Products
                              select product;
                return products.ToList<Product>();
            }
        }

        public void UpdateProduct(Product product)
        {
            using (var context = new EProductCollectionContext())
            {
               var prod = context.Products.Find(product.Id);

                if (prod != null) 
                {
                    prod.Title = product.Title;
                    prod.Description = product.Description;
                    prod.UnitPrice = product.UnitPrice;
                    prod.ImageUrl = product.ImageUrl;
                    prod.Quantity = product.Quantity;

                    context.SaveChanges();
                }

            }
        }
    }
}
