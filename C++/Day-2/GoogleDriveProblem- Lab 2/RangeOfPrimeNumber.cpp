// 8. Write a program to print all prime numbers between 1 to n
#include <bits/stdc++.h>
using namespace std;

bool isPrime(int num)
{
    if (num < 2)
    {
        return false;
    }

    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }

    return true;
}

int main()
{

    int num;
    cout << "Enter range number : ";
    cin >> num;

    for (int i = 2; i <= num; i++)
    {
        if (isPrime(i))
        {
            cout << i << " ";
        }
    }

    return 0;
}