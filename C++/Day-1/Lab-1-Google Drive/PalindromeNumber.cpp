//13:Check whether the number is palindrome or not?

#include<iostream>

using namespace std;

bool isPalindrome(int number){
	int temp = number;
	int reverse = 0;
	
	while(number>0){
		
		int rem = number % 10;
		reverse = reverse *10 + rem;
		number = number/10;
	}
	
	if(temp == reverse)
	return true;
	
	return false;
}

int main(){
	
	int num;
	cout<<"Enter the number to check for palindrome = ";
	cin>>num;
	
	bool checkPalindrome = isPalindrome(num);
	
	if(checkPalindrome){
		cout<<"The number "<<num<<" is palindrome number...";
	}else{
		cout<<"The number "<<num<<" is not a palindrome number...";
	}
	
	return 0;
}
