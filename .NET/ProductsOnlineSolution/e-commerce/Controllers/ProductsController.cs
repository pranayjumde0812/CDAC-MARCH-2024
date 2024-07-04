using e_commerce.Services;
using e_commerce.Models;
using Microsoft.AspNetCore.Mvc;

namespace e_commerce.Controllers
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
            return View();
        }

        public IActionResult GetAllProducts()
        {
            List<Product> products = productService.GetAll();

            return Json(products);

            //return View();
        }

        public IActionResult GetProductById(int id)
        {
            Product product = productService.GetById(id);


            if (product == null)
            {
                return NotFound();
            }
            else
            {
                return Json(product);
            }

            // return RedirectToAction("index");
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

            productService.Insert(product);
            return RedirectToAction("AddProduct");
        }

        public IActionResult DeleteById(int id)
        {
            productService.Delete(id);

            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult UpdateProduct()
        { 
            return View();
        }

        [HttpPost]
        public IActionResult UpdateProduct(string id,string title, string description, string unitPrice, string imageUrl, string quantity)
        {
            int pid = int.Parse(id);
            double price = double.Parse(unitPrice);
            int quantity1 = int.Parse(quantity);

            Product product = new Product(pid, title, description, price, imageUrl, quantity1);

            productService.Update(product);

            return View();
        }


    }
}
