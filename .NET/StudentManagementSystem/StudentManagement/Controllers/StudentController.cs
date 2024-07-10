using Microsoft.AspNetCore.Mvc;
using StudentManagement.Models;
using StudentManagement.Services;
using Newtonsoft.Json;

namespace StudentManagement.Controllers
{
    public class StudentController : Controller
    {
        private IStudentService studentService;

        public StudentController(IStudentService studentService)
        {
            this.studentService = studentService;
        }
        /*public IActionResult Index()
        {
            ViewBag.Layout = "~/Views/Shared/_StudentLayout.cshtml";

            // var student = TempData["Student"];

            ViewTemp["Student"].

           // return View(student);
           return Json(student);
        }*/

        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string username, string password)
        {
            var student  = studentService.GetStudent(username, password);

            if (student == null)
            {
                return View("Error");
            }

            TempData["Student"] = student;
            return RedirectToAction("Index");
        }
    }
}
