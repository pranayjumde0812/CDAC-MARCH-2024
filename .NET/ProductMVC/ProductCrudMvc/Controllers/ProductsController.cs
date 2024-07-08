using Microsoft.AspNetCore.Mvc;
using ProductCrudMvc.Models;
using ProductCrudMvc.Services;

namespace ProductCrudMvc.Controllers
{
    public class ProductsController : Controller
    {
        private IProductService productService;

        public ProductsController(IProductService productService)
        {
            this.productService = productService;
        }
        public IActionResult Index()
        {
            List<Product> products = productService.GetAllProducts();
            return View(products);
        }

        /* public IActionResult GetAllProducts()
         {
             List<Product> products = productService.GetAllProducts();
             return Json(products);

         }*/

        [HttpGet]
        public IActionResult FindById() 
        {
            return View();
        }

        [HttpPost]
        public IActionResult Details(int id)
        {
            Product product  = productService.GetProductById(id);

            if (product == null)
            {
                return RedirectToAction("FindById");
            }

            return View(product);
        }

        [HttpGet]
        public IActionResult Delete()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Delete(int id) 
        { 
            productService.DeleteProductById(id);
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult AddProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult AddProduct(string title, string description, string unitPrice, string imageUrl, string quantity)
        {
            double price = double.Parse(unitPrice);
            int quantity1 = int.Parse(quantity);

            Product product = new Product(title,description,price,imageUrl,quantity1);

            productService.AddProduct(product);

            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult UpdateProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult UpdateProduct(string id, string title, string description, string unitPrice, string imageUrl, string quantity)
        {
            int pid = int.Parse(id);
            double price = double.Parse(unitPrice);
            int quantity1 = int.Parse(quantity);

            Product product = new Product(pid,title, description, price, imageUrl, quantity1);

            productService.UpdateProduct(product);

            return RedirectToAction("Index");
        }
    }
}
