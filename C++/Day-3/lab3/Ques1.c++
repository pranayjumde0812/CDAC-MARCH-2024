// 1:Write a program to create an array of integers and perform following operations on that array like
// finding the sum, average, maximum and minimum number in that array. Accept the numbers of the
// array from user.
#include <iostream>
using namespace std;

int main()
{
    int size, sum = 0, avg;
    cout << "enter the size of the array\n";
    cin >> size;
    int arr[size];

    cout << "\nenter the elements of the array\n";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
        sum = sum + arr[i];
    }
    avg = sum / size;
    cout << "\nsum of the array is: " << sum;
    cout << "\navg of the array is: " << avg;
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            int temp = 0;
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    cout << "\nmin of the array is: " << arr[0];
    cout << "\nmax of the array is: " << arr[size - 1];
    cout << "sorted array";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}