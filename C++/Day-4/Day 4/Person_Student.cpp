/*Person and Student Inheritance:
Problem Statement: Model a system for handling individuals and students 
within an educational institution. Create a base class Person with attributes like name and age. 
Derive a Student class with additional attributes like student ID and CGPA, 
inheriting the common attributes from the Person class.
*/

#include<iostream>
using namespace std;
class Person{
    private:
    string name;
    int age;

    public:
    Person(string name,int age )
    {
        this->name=name;
        this->age=age;
    }
    virtual void displayInfo()
    {
        cout<<"Name: "<<name<<endl;
         cout<<"Age: "<<age<<endl;

    }
};
class Student:public Person{
    private:
    int ID;
    float CGPA;

    public:
    Student(string name,int age,int ID,float CGPA ):Person(name,age)
    {
        this->ID=ID;
        this->CGPA=CGPA;
    }
    void displayInfo()
    {
        Person::displayInfo();
        cout<<"Student ID: "<<ID<<endl;
         cout<<"CGPA: "<<CGPA<<endl;

    }
};
class Teacher:public Person{
    private:
    int ID;
    string dept;

    public:
    Teacher(string name,int age,int ID,string dept ):Person(name,age)
    {
        this->ID=ID;
        this->dept=dept;
    }
    void displayInfo()
    {
        Person::displayInfo();
        cout<<"Teacher ID: "<<ID<<endl;
         cout<<"Department Name: "<<dept<<endl;
    }
};



int main()
{
    Student s1("Rahul",23,122,9.95);
    s1.displayInfo();

    Teacher t1("Virat",35,1234,"IT");
    t1.displayInfo();
    return 0;
}
