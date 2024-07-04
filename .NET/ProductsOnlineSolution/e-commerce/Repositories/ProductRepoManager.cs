using e_commerce.Models;

namespace e_commerce.Repositories
{
    public class ProductRepoManager : IProductRepoManager
    {
        public void Delete(int id)
        {
            using (var context  =  new EStoreCollectionContext())
            {
                context.Products.Remove(context.Products.Find(id));
                context.SaveChanges();
            }
        }

        public List<Product> GetAll()
        {
            using (var context = new EStoreCollectionContext())
            {
                // LINQ
                var products = from product 
                               in context.Products
                               select product;
                return products.ToList<Product>();
            }
        }

        public Product GetById(int id)
        {
            using(var context = new EStoreCollectionContext())
            {
                return context.Products.Find(id);
            }
        }

        public void Insert(Product product)
        {
           using(var context = new EStoreCollectionContext())
            {
                context.Products.Add(product);
                context.SaveChanges();
            }
        }

        public void Update(Product product)
        {
            using( var context = new EStoreCollectionContext())
            {
                var prod = context.Products.Find(product.Id);
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
