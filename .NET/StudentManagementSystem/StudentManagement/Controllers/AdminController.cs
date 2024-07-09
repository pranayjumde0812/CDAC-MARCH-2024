using Microsoft.AspNetCore.Mvc;

namespace StudentManagement.Controllers
{
    public class AdminController : Controller
    {
        public IActionResult Index()
        {
            ViewBag.Layout = "~/Views/Shared/_AdminLayout.cshtml";
            return View();
        }

        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string username, string password)
        {
            return RedirectToAction("Index");
        }
    }
}
