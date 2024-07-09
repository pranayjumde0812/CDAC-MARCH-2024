namespace StudentManagement.Models
{
    public class Student
    {
        public int Id { get; set; }
        public string? Name { get; set; }

        public string Email { get; set; }

        public string MobileNumber { get; set; }

        public string Address { get; set; } 

        public DateTime AdmissionDate { get; set; }
        public double Fees { get; set; }

        public string Status { get; set; }

    }
}
