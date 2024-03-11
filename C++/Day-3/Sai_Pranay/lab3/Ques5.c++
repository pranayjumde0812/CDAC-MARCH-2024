// 5:Write a program to accept array  from user .Accept number from user and search number is present in array or not.
#include <iostream>
using namespace std;

int main()
{
    int size, element;
    cout << "enter the size of the array\n";
    cin >> size;
    int arr[size];

    cout << "\nenter the elements of the array\n";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    cout << "enter the element to be searched in the array\n";
    cin >> element;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == element)
        {
            cout << "element is present at index: " << i;
            return 0;
        }
    }
    cout << "element is not present in the array";

    return 0;
}