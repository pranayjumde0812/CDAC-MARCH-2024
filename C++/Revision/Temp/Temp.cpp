// #include<iostream>
#include <bits/stdc++.h>
using namespace std;

template <class T, class F>
void swapVal(T &a, F &b)
{

    F temp = a;
    a = b;
    b = temp;

    cout << a << " " << b;
}

template <typename T>
class marks
{
public:
    T m1, m2;

    marks(T m1, T m2)
    {
        this->m1 = m1;
        this->m2 = m2;
    }

    T getM1()
    {
        return m1;
    }

    T getM2()
    {
        return m2;
    }

    void setM1(T m1)
    {
        this->m1 = m1;
    }

    void setM2(T m2)
    {
        this->m2 = m2;
    }

    void display()
    {
        cout << "M1 = " << m1 << " : "
             << "M2 = " << m2;
    }
};

int main()
{
    // int a = 10;
    // float b = 30.9;

    // swapVal(a, b);

    // swapVal(a, b);

    //	cout<<a<<b<<endl;

    marks<int> m(23, 78);
    m.display();

    return 0;
}