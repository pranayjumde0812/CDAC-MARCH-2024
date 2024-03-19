// // Shape Sorting with Interfaces:
// // Problem Statement: Implement a shape sorting program.
// // Define a base class Shape with properties like area and perimeter.
// // Create derived classes like Circle, Rectangle, and Triangle. Implement an interface
// // Sortable with a method to compare shapes by area. Use this interface to sort a list of shapes.

// class Shape {
//     public :
//     virtual float area() =0;
//     virtual float perimeter()= 0;
// };

// class Rectangle :public Shape {
//     private :
//     double length, width;

//     public :
//     Rectangle(){

//     }
//     Rectangle(double length, double width) {
//         this->length = length;
//         this->width = width;
//     }
//     float area(){
//         cout<<"Area"
//     }

// };

#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

class Shape
{
public:
    virtual float area()
    {
        cout << "";
    };
    virtual float perimeter()
    {
        cout << "";
    };

    virtual string display()
    {
        cout << "";
    }
    virtual ~Shape() {}
};

class Circle : virtual public Shape
{
private:
    double radius;

public:
    Circle(double r) : radius(r) {}

    virtual float area() override
    {
        // cout << "Area of circle: " << 3.14 * radius * radius << endl;
        return 3.14 * radius * radius;
    }

    virtual float perimeter() override
    {
        // cout << "Perimeter of circle: " << 2 * 3.14 * radius << endl;
        return 2 * 3.14 * radius;
    }

    virtual string display()
    {
        return "circle";
    }
};

class Rectangle : virtual public Shape
{
private:
    double length, width;

public:
    Rectangle(double l, double w) : length(l), width(w) {}

    virtual float area() override
    {
        // cout << "Area of rectangle: " << length * width << endl;
        return length * width;
    }

    virtual float perimeter() override
    {
        // cout << "Perimeter of rectangle: " << 2 * (length + width) << endl;
        return 2 * (length + width);
    }
    virtual string display()
    {
        return "rectangle";
    }
};
class Diamond : public Rectangle, public Circle
{
private:
    float sumOfArea, length, width, radius;

public:
    Diamond(double l, double w,double r) : Rectangle(l,w),Circle(r){
        sumOfArea = Rectangle::area()+Circle::area();
    }

    float perimeter() override
    {
        // cout << "Perimeter of rectangle: " << 2 * (length + width) << endl;
        return Rectangle::perimeter()+Circle::perimeter();
    }
    float area(){
        return sumOfArea;
    }
    string display()
    {
        return "diamond";
    }
};

int main()
{
    int choice;
    double radius, length, width, side1, side2, side3;
    vector<Shape*> v;

    do
    {
        cout << "\nMenu:\n";
        cout << "1. Calculate area and perimeter of circle\n";
        cout << "2. Calculate area and perimeter of rectangle\n";
        cout << "3. Calculate area and perimeter of triangle\n";
        cout << "4. sorting\n";
        cout << "5. display vector\n";
        cout << "6. exit\n";

        cout << "Enter your choice: ";
        cin >> choice; // Read the user's choice here

        switch (choice)
        {
        case 1:
        {

            cout << "Enter radius of the circle: ";
            cin >> radius;
            Circle *circle=new Circle(radius);
            v.push_back(circle);
            circle->area();
            circle->perimeter();
            break;
        }
        case 2:
        {

            cout << "Enter length and width of the rectangle: ";
            cin >> length >> width;
            Rectangle *rectangle= new Rectangle(length, width);
            v.push_back(rectangle);

            rectangle->area();
            rectangle->perimeter();
            break;
        }
        case 3:
        {

            cout << "Enter length, width and radius of the diamond: ";
            cin >> length >> width>>radius;
            Diamond *d = new Diamond(length, width,radius);
            v.push_back(d);

            d->area();
            d->perimeter();
            break;
        }

        case 4:
        {
            for (int i = 0; i < v.size(); i++)
            {
                for (int j = i + 1; j < v.size(); j++)
                {
                    if (v[i]->area() > v[j]->area())
                    {
                        Shape *temp;
                        temp = v[i];
                        v[i] = v[j];
                        v[j] = temp;
                    }
                }
            }
            break;
        }
        case 5:
        {
            for (int i = 0; i < v.size(); i++)
            {
                cout << v[i]->display() << " : " << v[i]->area() << " ";
            }
            break;
        }

        case 6:
        {

            cout << "Exiting the program.\n";
            break;
        }
        default:
            cout << "Invalid choice. Please try again.\n";
            break;
        }
    } while (choice != 6);

    return 0;
}

// #include<iostream>
// using namespace std;

// int main()
// {

//     return 0;
// }

// Bank Account Inheritance:
// Problem Statement: Design a system for managing bank accounts.
//  Create a base class BankAccount with attributes like account number and balance.
//  Derive classes like SavingsAccount and CheckingAccount, each with specialized methods
//  like withdraw() and calculate_interest().
