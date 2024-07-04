using e_commerce.Models;
namespace e_commerce.Repositories
 
{
    public interface IProductRepoManager
    {
        List<Product> GetAll();
        Product GetById(int id);
        void Insert(Product product);
        void Update(Product product);
        void Delete(int id);
    }
}
