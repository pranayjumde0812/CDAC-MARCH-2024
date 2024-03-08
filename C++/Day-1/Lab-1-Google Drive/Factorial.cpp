//9:Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120

#include<iostream>
using namespace std;

int findFactorial(int num);

int main(){
	
	int number;
	
	cout<<"Enter the number = ";
	cin>>number;
	
	int factorialOfNumber = findFactorial(number);
	
	cout<<"Factorial of "<<number<<"! = "<<factorialOfNumber<<endl;
	
	
	return 0;
}

int findFactorial(int num){
	
	int fact = 1;
	
	while(num > 0){
		fact = fact * num;
		num--;
	}
	
	return fact;
}

