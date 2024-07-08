using ProductCrudMvc.Models;

namespace ProductCrudMvc.Repositories
{
    public interface IProductRepoManager
    {
        List<Product> GetAllProducts();

        Product GetProductById(int id); 

        void AddProduct(Product product);   

        void UpdateProduct(Product product);
        void DeleteProduct(int id);

    }
}
