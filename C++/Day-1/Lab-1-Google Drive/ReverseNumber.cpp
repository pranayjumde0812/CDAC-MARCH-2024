//15: Write a  program to enter a number and print its reverse.

#include<iostream>

using namespace std;

int reverseNumber(int number){
	int reverse = 0;
	
	while(number > 0){
		
		int rem = number % 10;
		reverse = reverse *10 + rem;
		number = number/10;
	}
	
	return reverse;
}

int main(){
	
	int number;
	
	cout<<"Enter the number = ";
	cin>>number;
	
	int reverseNum = reverseNumber(number);
	
	cout<<"The reverse of number "<<number<<" is : "<<reverseNum;
	
	return 0;
	
}


	
	
	


