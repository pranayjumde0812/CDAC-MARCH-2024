using e_commerce.Models;
using e_commerce.Repositories;

namespace e_commerce.Services
{
    public class ProductService : IProductService
    {
        private IProductRepoManager productRepo = new ProductRepoManager();

        public void Delete(int id)
        {
            productRepo.Delete(id);
        }

        public List<Product> GetAll()
        {
            return productRepo.GetAll();
        }

        public Product GetById(int id)
        {
            return productRepo.GetById(id);
        }

        public void Insert(Product product)
        {
            productRepo.Insert(product);
        }

        public void Update(Product product)
        {
            productRepo.Update(product);
        }
    }
}
