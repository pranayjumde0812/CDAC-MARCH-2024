//18:Write a program to find greatest of three numbers using nested if-else.

#include<iostream>

using namespace std;

int main(){
	
	int a,b,c;
	
	cout<<"Enter value of A = ";
	cin>>a;
	
	cout<<"Enter value of B = ";
	cin>>b;
	
	cout<<"Enter value of C = ";
	cin>>c;
	
	
	if(a > b && a > c ){
		cout<<"A = "<<a<<" is greater than B = "<<b<<" and C = "<<c;
	}else if(b > a && b > c){
		cout<<"B = "<<b<<" is greater than A = "<<a<<" and C = "<<c;
	}else{
		cout<<"C = "<<c<<" is greater than A = "<<a<<" and B = "<<b;
	}
	
	
	return 0;
}
