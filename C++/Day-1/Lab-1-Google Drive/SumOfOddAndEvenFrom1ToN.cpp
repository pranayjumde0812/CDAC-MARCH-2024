//14:Write a  program to find sum of all even and odd numbers between 1 to n.

#include<iostream>

using namespace std;

int main(){
	
	int num;
	cout<<"Enter n = ";
	cin>>num;
	
	int sumOfEvenNumbers = 0 , sumOfOddNumbers = 0;
	
	for (int i = 1 ; i <= num ; i++){
		
		if(i%2 == 0){
			sumOfEvenNumbers += i; 
			
		}else{
			sumOfOddNumbers += i; 
		}
	}
	
	cout<<"Sum of all even number from 1 to "<<num<<" = "<<sumOfEvenNumbers<<endl;
	cout<<"Sum of all odd number from 1 to "<<num<<" = "<<sumOfOddNumbers<<endl;
	
	return 0;
}
