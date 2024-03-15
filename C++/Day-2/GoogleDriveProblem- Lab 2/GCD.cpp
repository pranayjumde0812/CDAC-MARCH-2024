// 6. Accept two numbers and calculate GCD of them.
#include<iostream>
using namespace std;

int main()
{

    int num1, num2;

    cout << "Enter two numbers : ";
    cin >> num1 >> num2;

    int gcd;
    int i = 1;
    while (i <= num1 && i <= num2)
    {

        if (num1 % i == 0 && num2 % i == 0)
        {
            gcd = i;
        }
        i++;
    }

    cout << "GCD = " << gcd;

    return 0;
}