// 3. Write a program to accept a character, an integer n and display the next n characters.

#include <iostream>

using namespace std;

int main()
{

    char ch;
    int num;

    cout << "Enter Character : ";
    cin >> ch;
    cout << "Enter range : ";
    cin >> num;

    for (int i = 1; i <= num; i++)
    {

        cout << char(ch + i) << " ";

    }

    return 0;
}