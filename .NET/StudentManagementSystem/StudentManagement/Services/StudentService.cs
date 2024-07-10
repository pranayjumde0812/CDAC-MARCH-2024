using StudentManagement.Models;
using StudentManagement.Repositories;

namespace StudentManagement.Services
{
    public class StudentService : IStudentService
    {
        private IStudentRepoManager studentRepo = new StudentRepoManager(); 
        public Student GetStudent(string username, string password)
        {
            return studentRepo.GetStudentDetails(username, password);
        }

        public void UpdateStudent(Student student)
        {
            studentRepo.UpdateStudentDetails(student);
        }
    }
}
