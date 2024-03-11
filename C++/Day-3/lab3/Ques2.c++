// 2: Write a program to Accept a number and display its sum of digits.:ex 568    5+6+8
#include<iostream>
using namespace std;

int main()
{
    cout<<"enter the number\n";

    int num;
    cin>>num;
    int sum=0;
    while(num!=0){
        sum = sum+num%10;
        num = num/10;
    }
    cout<<"\nthe sum of the digits of the number is: "<<sum;
    return 0;
}