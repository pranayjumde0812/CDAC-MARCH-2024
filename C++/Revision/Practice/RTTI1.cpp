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

// class Circle : public Shape
// {
// private:
//     double radius;

// public:
//     Circle(double r) : radius(r) {}

//     float area() override
//     {
//         // cout << "Area of circle: " << 3.14 * radius * radius << endl;
//         return 3.14 * radius * radius;
//     }

//     float perimeter() override
//     {
//         // cout << "Perimeter of circle: " << 2 * 3.14 * radius << endl;
//         return 2 * 3.14 * radius;
//     }

//     virtual string display()
//     {
//         return "circle";
//     }
// };

class Rectangle : public Shape
{
private:
    double length, width;

public:
    Rectangle(double l, double w) : length(l), width(w) {}

    float area() override
    {
        // cout << "Area of rectangle: " << length * width << endl;
        return length * width;
    }

    float perimeter() override
    {
        // cout << "Perimeter of rectangle: " << 2 * (length + width) << endl;
        return 2 * (length + width);
    }
    virtual string display()
    {
        return "rectangle";
    }

    ~Rectangle(){
        // delete rectangle;
    }
};

// class Triangle : public Shape
// {
// private:
//     double side1, side2, side3;

// public:
//     Triangle(double s1, double s2, double s3) : side1(s1), side2(s2), side3(s3) {}

//     float area() override
//     {
//         double s = (side1 + side2 + side3) / 2;
//         // cout << "Area of triangle: " << sqrt(s * (s - side1) * (s - side2) * (s - side3)) << endl;
//         return sqrt(s * (s - side1) * (s - side2) * (s - side3));
//     }

//     float perimeter() override
//     {
//         // cout << "Perimeter of triangle: " << side1 + side2 + side3 << endl;
//         return side1 + side2 + side3;
//     }
//     virtual string display()
//     {
//         return "triangle";
//     }
// };

int main()
{
    int choice;
    double radius, length, width, side1, side2, side3;
    // vector<Shape*> v;
    Shape *arr[2];
    int index=-1;

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
        // case 1:
        // {

        //     cout << "Enter radius of the circle: ";
        //     cin >> radius;
        //     Circle circle(radius);
        //     v.push_back(&circle);
        //     circle.area();
        //     circle.perimeter();
        //     break;
        // }
        case 2:
        {

            cout << "Enter length and width of the rectangle: ";
            cin >> length >> width;
            Rectangle *rectangle = new Rectangle(length, width);
            arr[++index]=rectangle;

            rectangle->area();
            rectangle->perimeter();
            break;
        }
        // case 3:
        // {

        //     cout << "Enter lengths of three sides of the triangle: ";
        //     cin >> side1 >> side2 >> side3;
        //     Triangle triangle(side1, side2, side3);
        //     v.push_back(&triangle);

        //     triangle.area();
        //     triangle.perimeter();
        //     break;
        // }
        case 4:
        {
            for (int i = 0; i < 2; i++)
            {
                for (int j = i + 1; j <2; j++)
                {
                    // cout<<arr[i]->area();
                    if (arr[i]->area() > arr[j]->area())
                    {
                        Shape *temp;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            break;
        }
        case 5:
        {
            for (int i = 0; i < 2; i++)
            {
                cout << arr[i]->display() << " : " << arr[i]->area() << " ";
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
