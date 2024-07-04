using e_commerce.Models;

namespace e_commerce.Services
{
    public interface IProductService
    {
        List<Product> GetAll();
        Product GetById(int id);
        void Insert(Product product);
        void Update(Product product);
        void Delete(int id);
    }
}
