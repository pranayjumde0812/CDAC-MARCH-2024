using ProductCrudMvc.Models;

namespace ProductCrudMvc.Repositories
{
    public class ProductRepoManager : IProductRepoManager
    {

        public void AddProduct(Product product)
        {
            using (var context = new EStoreCollectionContext())
            {
                context.Products.Add(product);
                context.SaveChanges();
            }
        }

        public void DeleteProduct(int id)
        {
            using (var context = new EStoreCollectionContext())
            {
                var productById = context.Products.Find(id);
                if (productById != null)
                {
                    context.Products.Remove(productById);
                    context.SaveChanges();
                }
            }
        }

        public List<Product> GetAllProducts()
        {
            using (var context = new EStoreCollectionContext())
            {
                var products = from product
                               in context.Products
                               select product;
                return products.ToList<Product>();
            }
        }

        public Product GetProductById(int id)
        {
            using (var context = new EStoreCollectionContext())
            {
                var product = context.Products.Find(id);
                
                
                    return product;
                
              
            }
        }

        public void UpdateProduct(Product product)
        {
            using (var context = new EStoreCollectionContext())
            {
                var productById = context.Products.Find(product.Id);

                if (productById != null)
                {
                    productById.Title = product.Title;
                    productById.Description = product.Description;
                    productById.UnitPrice = product.UnitPrice;
                    productById.ImageUrl = product.ImageUrl;
                    productById.Quantity = product.Quantity;

                    context.SaveChanges();
                }
            }
        }
    }
}
