// 7. Write a menu driven program to do following operations :
// a) Compute area of circle
// b) Compute area of rectangle
// c) Compute area of triangle
// d) Exit
// Display menu, ask choice to the user, depending on choice accept the parameters and perform the
// operation. Continue this process until user selects exit option.

#include <iostream>
#define PI 3.141
using namespace std;

int main()
{

    double radius, length, width, base, height, area;
    char choice;

    do
    {
        cout << "a. Compute Area of Circle\n";
        cout << "b. Compute Area of Rectangle\n";
        cout << "c. Compute Area of Triangle\n";
        cout << "d. Exit\n";

        cout << "Enter choice in a, b, c." << endl;
        cin >> choice;
        switch (choice)
        {
        case 'a':
            cout << "Enter radius of circle " << endl;
            cin >> radius;
            area = PI * radius * radius;
            cout << "Area of circle = " << area << endl;
            break;
        case 'b':
            cout << "Enter length and width of rectangle " << endl;
            cin >> length >> width;
            area = length * width;
            cout << "Area of rectangle = " << area << endl;
            break;
        case 'c':
            cout << "Enter base and heigth of triangle " << endl;
            cin >> base >> height;
            area = 0.5 * base * height;
            cout << "Area of triangle= " << area << endl;
            break;
        
        case 'd':
            cout << "Exiting....." << endl;
            break;

        default:
            cout << "Invalid choice!!!";
            break;
        }
    } while (choice != 'd');

    return 0;
}
