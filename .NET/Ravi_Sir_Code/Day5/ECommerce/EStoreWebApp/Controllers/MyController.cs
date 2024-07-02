using Microsoft.AspNetCore.Mvc;

namespace EStoreWebApp.Controllers
{
    public class MyController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
