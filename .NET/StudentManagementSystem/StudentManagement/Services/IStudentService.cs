using StudentManagement.Models;

namespace StudentManagement.Services
{
    public interface IStudentService
    {
        Student GetStudent(string username, string password);

        void UpdateStudent(Student student);
    }
}
