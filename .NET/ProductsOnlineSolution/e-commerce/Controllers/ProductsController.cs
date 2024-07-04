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

    }
}
