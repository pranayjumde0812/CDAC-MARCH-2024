using StudentManagement.Models;

namespace StudentManagement.Repositories
{
    public interface IStudentRepoManager
    {
        Student GetStudentDetails(string username, string password);

        void UpdateStudentDetails(Student student);
    }
}
