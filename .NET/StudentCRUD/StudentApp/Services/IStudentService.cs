using StudentApp.Models;

namespace StudentApp.Services
{
    public interface IStudentService
    {
        List<Student> GetStudents();
        void AddStudent(Student student);
        List<Student> SearchStudentByStatus(string status);
        void UpdateStudent(Student student);
        void DeleteStudent(int id);
        List<Student> SortStudentBasedOnStatus();
        Student GetById(int id);
    }
}
