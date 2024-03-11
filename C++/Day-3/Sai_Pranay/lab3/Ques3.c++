// 3:. Write a  program to find sum of all even and odd numbers between 1 to n. 
#include<iostream>
using namespace std;

int main()
{
    cout<<"enter the value of n:\n";
    int n;
    cin>>n;
    int sumEven=0,sumOdd=0;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            sumEven = sumEven+i;
        }else{
        sumOdd = sumOdd+i;
        }
    }
    cout<<"\nsum of even numbers is: "<<sumEven;
    cout<<"\nsum of odd numbers is: "<<sumOdd;
    return 0;
}