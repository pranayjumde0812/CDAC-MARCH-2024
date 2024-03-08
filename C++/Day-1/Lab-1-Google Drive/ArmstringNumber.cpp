//17:Write a program to check entered number is Armstrong number or not.

#include<iostream>
using namespace std;

bool isArmstrong(int num);
int countDigits(int number);
int power(int d, int p);

int main(){
	
	int number;
	cout<<"Enter the number = ";
	cin>>number;
	
	bool result = isArmstrong(number);
	
	if(result){
		cout<<number<<" is Armstrong number";
	}else{
		cout<<number<<" is not a Armstrong number";
	}
	
	return 0;
}

int countDigits(int num){
	int count =0 ;
	while(num !=0){
		count++;
		num = num /10;
	}
	
	return count;
}

int power(int d, int p){
	
	int power = 1;
	
	while(p > 0){
		power = power * d;
		p--;
	}
	
	return power;
}

bool isArmstrong(int number){
	
	int nd = countDigits(number);
	
	int temp = number;
	int rem, sum = 0;
	
	while(number != 0){
		rem = number%10;
		
		sum += power(rem , nd);
		
		number /= 10;
	}
	
	if( temp == sum){
		return true;
	}else{
		return false;
	}
	
}



