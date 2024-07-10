using StudentApp.Models;
using StudentApp.Repositories;

namespace StudentApp.Services
{
    public class StudentService : IStudentService
    {
        private IStudentRepoManager repoManager = new StudentRepoManager();
        public void AddStudent(Student student)
        {
            repoManager.AddStudent(student);
        }

        public void DeleteStudent(int id)
        {
           repoManager.DeleteStudent(id);
        }

        public Student GetById(int id)
        {
            return repoManager.GetById(id);
        }

        public List<Student> GetStudents()
        {
           return repoManager.GetStudents();
        }

        public List<Student> SearchStudentByStatus(string status)
        {
           return repoManager.SearchStudentByStatus(status);
        }

        public List<Student> SortStudentBasedOnStatus()
        {
            return repoManager.SortStudentBasedOnStatus();
        }

        public void UpdateStudent(Student student)
        {
           repoManager.UpdateStudent(student);
        }
    }
}
