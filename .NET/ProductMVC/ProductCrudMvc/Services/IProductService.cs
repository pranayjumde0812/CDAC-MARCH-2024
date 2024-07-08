using ProductCrudMvc.Models;


namespace ProductCrudMvc.Services
{
    public interface IProductService
    {
        List<Product> GetAllProducts();
        Product GetProductById(int id);
        void DeleteProductById(int id);
        void UpdateProduct(Product product);
        void AddProduct(Product product);

    }
}
