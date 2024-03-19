// 1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
// Accept data (acceptInfo()) and display  using display member function.
// Also display total,percentage and grade.

#include <iostream>
using namespace std;

class Student
{
private:
    int rollNo;
    int marks1;
    int marks2;
    int marks3;
    int totalMarks;
    double percentage;
    char grade;

public:
    void acceptInfo(int rollNo, int marks1, int marks2, int marks3)
    {
        this->rollNo = rollNo;
        this->marks1 = marks1;
        this->marks2 = marks2;
        this->marks3 = marks3;
    }

    void displayDetails()
    {
        cout << "Roll Number = " << rollNo << endl;
        cout << "Marks1 = " << marks1 << endl;
        cout << "Marks2 = " << marks2 << endl;
        cout << "Marks3 = " << marks3 << endl;
    }

    void percentageDetails()
    {
        totalMarks = marks1 + marks2 + marks3;
        cout << "Total marks obtain = " << totalMarks << endl;
        percentage = (totalMarks * 100 / 300);
        cout << "Total percentage = " << percentage << endl;

        if (percentage >= 85)
        {
            grade = 'A';
        }
        else if (percentage < 85 || percentage > 60)
        {
            grade = 'B';
        }
        else
        {
            grade = 'C';
        }

        cout << "Grade = " << grade << endl;
    }
};

int main()
{
    Student student;

    student.acceptInfo(181, 88, 95, 77);
    student.displayDetails();
    student.percentageDetails();
}
