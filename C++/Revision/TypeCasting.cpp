#include <iostream>
using namespace std;

int main()
{
    int a = 10;
    long b = a;
    cout << b << endl;

    long c = 80;

    int d = (int)c;
    cout << d << endl;

    int e = 20;
    float f = static_cast<float>(e);
    cout << f << endl;

    int *ptr = new int;
    void *vPtr = static_cast(ptr);

    cout << &vPtr << endl;
}