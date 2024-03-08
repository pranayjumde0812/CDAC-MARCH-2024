//Que 5. Write a program to accept a number and check if it is divisible by 5 and 7.

#include<iostream>
using namespace std;

int main(){
	
	int a;
	
	cout<<"Enter variable a = "<<endl;
	cin>>a;
	
	if(a%5==0 && a%7==0){
		cout<<"Entered number is divisible by 5 and 7 both"<<endl;
	}else{
		cout<<"Entered number is not divisible by 5 and 7 both"<<endl;
	}
	
	return 0;
}
