//16:Write a  program to print all Prime numbers between 1 to n

#include<iostream>
using namespace std;

bool isPrime(int number);

int main(){
	int number;
	
	cout<<"Enter the number till you want to check prime number : ";
	cin>>number;
	
	for(int i = 1; i <= number ; i++){
		
		if(isPrime(i)){
			cout<<i<<" ";
		}
	}
	
	return 0;
}

 bool isPrime(int number) {

        if (number == 0 || number == 1)
            return false;

        for (int i = 2; i < number; i++) {
        	
            if (number % i == 0) {
                return false;
            }
        }
        return true;
}
