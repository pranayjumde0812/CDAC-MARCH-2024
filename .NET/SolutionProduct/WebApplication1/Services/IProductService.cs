using WebApplication1.Models;

namespace WebApplication1.Services
{
    public interface IProductService
    {
        List<Product> GetProducts();

        Product GetProductById(int id);

        void AddProduct(Product product);

        void UpdateProduct(Product product);

        void DeleteProduct(int id);
    }
}
