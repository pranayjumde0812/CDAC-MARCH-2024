//Q1. Write a C Program to find the Maximum and minimum of two numbers without 
//using any loop or condition.

#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    int min = b ^ ((a ^ b) & -(a < b));
    int max = a ^ ((a ^ b) & -(a < b));

    cout << "Maximum of " << a << " and " << b << " is: " << max <<endl;
    cout << "Minimum of " << a << " and " << b << " is: " << min <<endl;

    return 0;
}

