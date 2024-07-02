using Microsoft.AspNetCore.Mvc;

namespace EStoreWebApp.Controllers
{
    public class ProductsController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Details()
        {
            return View();
        }

        public IActionResult Insert()
        {
            return View();
        }
        public IActionResult Update()
        {
            return View();
        }
        public IActionResult Delete()
        {
            //logic of deleting product from list
            //redirect to same index
            return RedirectToAction("Index");
            //return View();
        }

    }
}
