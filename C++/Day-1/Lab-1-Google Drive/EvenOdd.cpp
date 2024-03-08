//Que 4. Write a program to accept an integer and check if it is even or odd.
#include <iostream>

using namespace std;

int main(){
	
	int a;
	
	cout<<"Enter variable a = "<<endl;
	cin>>a;
	
	if(a%2==0){
		cout<<"Entered number is Even"<<endl;
	}else{
		cout<<"Entered number is Odd"<<endl;
	}
	
	return 0;
}
