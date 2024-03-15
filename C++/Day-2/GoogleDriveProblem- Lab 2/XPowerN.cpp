// 2. Write a program to accept two integers x and n and compute x raised to n.
#include <iostream>
using namespace std;

int main()
{

    int x, n;
    int power = 1;

    cout << "Enter the x and n " << endl;
    cin >> x >> n;

    while (n != 0)
    {
        power = x * x;
        n--;
    }

    cout << "X power n = " << power;

    return 0;
}
