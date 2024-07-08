using ProductCrudMvc.Models;
using ProductCrudMvc.Repositories;

namespace ProductCrudMvc.Services
{
    public class ProductService : IProductService
    {
        private IProductRepoManager _productRepo = new ProductRepoManager();

        public void AddProduct(Product product)
        {
            _productRepo.AddProduct(product);
        }

        public void DeleteProductById(int id)
        {
            _productRepo.DeleteProduct(id);
        }

        public List<Product> GetAllProducts()
        {
           return _productRepo.GetAllProducts();
        }

        public Product GetProductById(int id)
        {
            return _productRepo.GetProductById(id); 
        }

        public void UpdateProduct(Product product)
        {
            _productRepo.UpdateProduct(product);
        }
    }
}
