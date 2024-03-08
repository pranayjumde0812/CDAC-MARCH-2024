//11:Check if number is a prime number or not.:

#include<iostream>
using namespace std;

bool checkPrime(int number);

int main(){
	
	int number;
	
	cout<<"Enter the number = "<<endl;
	cin>>number;
	
	bool isPrime = checkPrime(number);
	
	if(isPrime){
		cout<<"Number is prime number";
	}else
		cout<<"Number is not a prime numbers";
	
}

bool checkPrime(int number){
	
	bool isPrime = true;
	
	if(number==0 || number == 1)
	return false;
	else{
		
		for(int i = 2; i <= number/2 ; i++){
			if(number%i == 0){
				isPrime = false;
				break;
			}
		}
	}
	
	if(isPrime){
		return isPrime;
	}
	
	return isPrime;
}

