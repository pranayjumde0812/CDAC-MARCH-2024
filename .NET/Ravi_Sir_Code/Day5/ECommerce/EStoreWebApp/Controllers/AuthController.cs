using EStoreWebApp.Models;
using EStoreWebApp.Services;
using Microsoft.AspNetCore.Mvc;

namespace EStoreWebApp.Controllers
{
    public class AuthController : Controller
    {
       private IUserService _userService;
        public AuthController(IUserService userService)
        {
            _userService=userService;
        }

        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string email, string password)
        {
            if(email =="ravi.tambade@transflower.in" 
                &&  password == "seed")
            {
                return RedirectToAction("index", "products");
            }
            return View();
        }


        public IActionResult Register()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Register(string firstName, string lastName, string contactNumber, string email)
        {

            User user = new User();
            user.FirstName = firstName;
            user.LastName = lastName;
            user.ContactNumber = contactNumber;
            user.Email = email;
            _userService.Insert(user);
            return View();
        }


    }
}
