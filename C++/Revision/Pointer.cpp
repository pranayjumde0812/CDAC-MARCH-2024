#include <iostream>
using namespace std;

int main()
{

    int a = 90;
    cout << a << endl;
    cout << &a << endl;

    int *ptr = &a;
    cout << ptr << endl;
    cout << &ptr << endl;
    cout << *ptr << endl;

    *ptr = 23;
    cout << a << endl;

    cout << "-----------------------------" << endl;
    int f = 30;
    int *p = &f;
    cout << *p << endl;
    cout << &p << endl;
    cout << &f << endl;
    cout << p << endl;
}