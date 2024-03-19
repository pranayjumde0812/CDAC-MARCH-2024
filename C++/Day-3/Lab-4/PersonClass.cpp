// 1. Create a class Person with data members as name, age, city. Write getters and setters for all the data
// members. Also add the display function. Create Default and Parameterized constructors. Create the
// object of this class in main method and invoke all the methods in that class.
// #include <iostream>
// #include <string.h>
#include <bits/stdc++.h>
using namespace std;

class Person
{

private:
    string name;
    int age;
    string city;

public:
    Person()
    {
        name = "-";
        age = 0;
        city = "-";
    }
    Person(string name, int age, string city)
    {
        this->name = name;
        this->age = age;
        this->city = city;
    }

    void setName(string name)
    {
        this->name = name;
    }
    void setAge(int age)
    {
        this->age = age;
    }
    void setCity(string city)
    {
        this->city = city;
    }

    string getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    string getCity()
    {
        return city;
    }
};

int main()
{
    cout << "Using default construcor" << endl;
    Person person;
    person.setName("pranay");
    person.setAge(24);
    person.setCity("Nagpur");

    cout << "Name = " << person.getName() << ", Age = " << person.getAge() << ", City = " << person.getCity() << endl;

    cout << "Using Paramter construcor" << endl;
    Person person1("Anuj", 25, "Nagpur");
    cout << "Name = " << person1.getName() << ", Age = " << person1.getAge() << ", City = " << person1.getCity() << endl;
}