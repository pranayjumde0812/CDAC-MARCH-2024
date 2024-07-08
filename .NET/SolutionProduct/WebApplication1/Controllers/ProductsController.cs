using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;
using WebApplication1.Services;

namespace WebApplication1.Controllers
{
    public class ProductsController : Controller
    {
        private IProductService _productService;

        public ProductsController (IProductService productService)
        {
            _productService = productService;
        }

        public IActionResult Index()
        {
            List<Product> products = _productService.GetProducts();
           return Json(products);
        }

        public IActionResult GetById(int id)
        {
            Product products = _productService.GetProductById(id);
            return Json(products);
        }

        public IActionResult Delete(int id)
        {
            _productService.DeleteProduct(id);
            return RedirectToAction("index");
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

            Product product = new Product(title, description, price, imageUrl, quantity1);

            _productService.AddProduct(product);

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

            Product product = new Product(pid, title, description, price, imageUrl, quantity1);

            _productService.UpdateProduct(product);

            return RedirectToAction("Index");
        }
    }
}
