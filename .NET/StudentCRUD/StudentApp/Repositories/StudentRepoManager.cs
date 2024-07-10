using StudentApp.Models;

namespace StudentApp.Repositories
{
    public class StudentRepoManager : IStudentRepoManager
    {
        public void AddStudent(Student student)
        {
            using (var context = new StudentCollectionContext())
            {
                context.Students.Add(student);
                context.SaveChanges();
            }
        }

        public void DeleteStudent(int id)
        {
            using (var context = new StudentCollectionContext())
            {
                context.Students.Remove(context.Students.Find(id));
                context.SaveChanges();
            }
        }

        public Student GetById(int id)
        {
            using (var context = new StudentCollectionContext())
            {
                var student = context.Students.Find(id);
                return student;
            }
        }

        public List<Student> GetStudents()
        {
            using (var context = new StudentCollectionContext())
            {
                List<Student> students = context.Students.ToList();
                return students;
            }
        }

        public List<Student> SearchStudentByStatus(string status)
        {
            using (var context = new StudentCollectionContext())
            {
                List<Student> students = context.Students.Where(s => s.Status.Equals(status)).ToList();
                return students;
            }
        }

        public List<Student> SortStudentBasedOnStatus()
        {
            using (var context = new StudentCollectionContext())
            {
                List<Student> students = context.Students.ToList();
               students.Sort((x,y) => x.Status.CompareTo(y.Status));
                return students;
            }
        }

        public void UpdateStudent(Student student)
        {
            using (var context = new StudentCollectionContext())
            {
                var stud = context.Students.Find(student.Id);

                if(stud != null)
                {
                    stud.Name = student.Name;
                    stud.Email = student.Email;
                    stud.MobileNumber = student.MobileNumber;
                    stud.Address = student.Address;
                    stud.AdmissionDate = student.AdmissionDate;
                    stud.Fees = student.Fees;
                    stud.Status = student.Status;

                    context.SaveChanges();
                }
            }
        }
    }
}
