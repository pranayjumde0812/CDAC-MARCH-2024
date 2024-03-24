//21. Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the 
//corresponding operation and displays the result.

#include<iostream>

using namespace std;

int main() {
    int a, b;
    int c;
    
    char oper; 
    
    cout << "Enter value of a = ";
    cin >> a;
    
    cout << "Enter value of b = ";
    cin >> b;
    
    cout << "Enter the Operator : + , - , * , / ";
    cin >> oper;
    
    switch (oper) { // Changed from operator to oper
        
        case '+':
            c = a + b;
            cout << "Addition of (a+b) = " << c;
            break;
        
        case '-':
            c = a - b;
            cout << "Substraction of (a-b) = " << c;
            break;
        
        case '*':
            c = a * b;
            cout << "Multiplication of (a*b) = " << c;
            break;
        
        case '/':
            if (b != 0) {
                c = a / b;
                cout << "Division of (a/b) = " << c;
            } else {
                cout << "Error: Division by zero!";
            }
            break;
        
        default:
            cout << "Invalid operator!!!";
    }
    
    return 0;
}

