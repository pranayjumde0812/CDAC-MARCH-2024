// 6:Write a program to print following pattern.
// *
// * *
// * * *
// * * * *
// * * * * *
#include <iostream>
using namespace std;

int main()
{
    int x;
    cin>>x;
    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j <= i; j++)
        {
                cout << "* ";
            
        }
        cout << "\n";
    }
    return 0;
}