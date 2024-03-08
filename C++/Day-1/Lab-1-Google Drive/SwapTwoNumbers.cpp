//Que 3:Write a program to swap two numbers. 

#include<iostream>

using namespace std;

int main(){
	
	int a,b,temp;
	
	cout<<"Enter variable a = "<<endl;
	cin>>a;
	
	cout<<"Enter variable b = "<<endl;
	cin>>b;
	
	cout<<"Before Swapping"<<endl;
	cout<<"a = "<<a<<endl;
	cout<<"b = "<<b<<endl;
	
	temp = a;
	a = b;
	b = temp;
	
	cout<<"After Swapping"<<endl;
	cout<<"a = "<<a<<endl;
	cout<<"b = "<<b<<endl;
	
	return 0;
}
