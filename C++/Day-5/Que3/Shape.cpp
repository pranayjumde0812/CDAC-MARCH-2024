#include <string.h>
#include "Shape.h"
#include <iostream>
using namespace std;

class Rectangle : public Shape
{
private:
    int length, breadth;

public:
    Rectangle(int length, int breadth)
    {
        this->length = length;
        this->breadth = breadth;
    }
    void area()
    {
        cout << "area of rectangle is:" << length * breadth;
    }
};

class Circle : public Shape
{
private:
    int radius;

public:
    Circle(int radius)
    {
        this->radius = radius;
    }
    void area()
    {
        cout << "area of circle is:" << 3.14 * radius * radius;
    }
};

class Square : public Shape
{
private:
    int length;

public:
    Square(int length)
    {
        this->length = length;
    }
    void area()
    {
        cout << "area of square is:" << length * length;
    }
};

int main()
{
    Rectangle r(5, 6);
    r.area();
    cout << "\n-----------\n";

    Square sq(5);
    sq.area();
    cout << "\n-----------\n";

    Circle c(5);
    c.area();
}
