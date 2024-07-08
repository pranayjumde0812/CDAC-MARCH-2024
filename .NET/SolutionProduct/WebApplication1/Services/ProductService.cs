using WebApplication1.Models;
using WebApplication1.Repositories;

namespace WebApplication1.Services
{
    public class ProductService : IProductService
    {
        private IProductRepoManager productRepo = new ProductRepoManager();

        public void AddProduct(Product product)
        {
           productRepo.AddProduct(product);
        }

        public void DeleteProduct(int id)
        {
           productRepo.DeleteProduct(id);
        }

        public Product GetProductById(int id)
        {
            return productRepo.GetProductById(id);
        }

        public List<Product> GetProducts()
        {
            return productRepo.GetProducts();
        }

        public void UpdateProduct(Product product)
        {
            productRepo.UpdateProduct(product);
        }
    }
}
