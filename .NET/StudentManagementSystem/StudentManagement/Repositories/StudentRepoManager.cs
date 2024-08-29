using StudentManagement.Models;

namespace StudentManagement.Repositories
{
    public class StudentRepoManager : IStudentRepoManager
    {
        public Student GetStudentDetails(string username, string password)
        {
            using (var context = new StudentCollectionContext())
            {
                var student = context.Students.SingleOrDefault(student => student.Email == username && student.MobileNumber == password);

                return student;
            }
        }

        public void UpdateStudentDetails(Student student)
        {
            using (var context = new StudentCollectionContext())
            {
                var dbStudent = context.Students.Find(student.Id);

                if (dbStudent != null)
                {
                    dbStudent.Name = student.Name;
                    dbStudent.Email = student.Email;
                    dbStudent.MobileNumber = student.MobileNumber;
                    dbStudent.Address = student.Address;
                    dbStudent.Status = student.Status;

                    context.SaveChanges();
                }
            }
            
        }
    }
}