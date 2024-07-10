using Microsoft.AspNetCore.Mvc;
using StudentApp.Models;
using StudentApp.Services;

namespace StudentApp.Controllers
{
    public class StudentController : Controller
    {
        private IStudentService studentService;

        public StudentController(IStudentService studentService)
        {
            this.studentService = studentService;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GetAll()
        {
            List<Student> students = studentService.GetStudents();
            //return View();
            return Json(students);
        }

        public IActionResult Detail(int id)
        {
            Student student = studentService.GetById(id);
            if (student == null)
            {
                return NotFound();
            }

            return Json(student);
        }

        public IActionResult SearchByStatus(string status)
        {
            {
                List<Student> students = studentService.SearchStudentByStatus(status);
                //return View();
                return Json(students);
            }
        }
    }
}
