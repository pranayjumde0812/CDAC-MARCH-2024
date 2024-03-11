// 4:. Write a  program to print all Prime numbers between 1 to n.
#include <iostream>
using namespace std;
bool isPrime(int num)
{
    bool check = false;

    if (num == 1)
    {
        return false;
    }
    for (int i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            check = false;
            return check;
        }
    }
    return true;
}
int main()
{
    cout << "enter the value of n:\n";
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        if (isPrime(i))
        {
            cout << i << " ";
        }
    }

    return 0;
}