// 4. Write a program to calculate factorial of a number.

#include <iostream>
using namespace std;

int main()
{

    int fact = 1;
    int number;
    cout << "Enter the number : ";
    cin >> number;
    int temp = number;

    while (number != 0)
    {
        fact = fact * number;
        number--;
    }

    cout << "Factorial of " << temp << "! = " << fact;

    return 0;
}