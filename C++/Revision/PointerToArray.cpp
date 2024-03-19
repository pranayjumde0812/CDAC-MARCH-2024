#include <iostream>
using namespace std;

int main()
{
    int arr[] = {4, 5, 2, 5, 2, 5, 8};
    cout << arr << endl;

    int *ptr = arr;
    cout << ptr << endl;
    cout << "Ptr " << *ptr << endl;

    for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
    {
        cout << *ptr << " ";
    }
}