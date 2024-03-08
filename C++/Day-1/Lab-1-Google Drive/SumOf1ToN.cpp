//12:Sum of series :  1+2+3+….+n

#include<iostream>

using namespace std ;

int sumOf1ToN(int n){
	int sum = 0;
	
	for(int i = 1; i <= n ; i++){
		sum += i;
	}
	return sum;
}

int main(){
	
	int num;
	cout<<"Enter the limit upto you want to sum = "<<endl;
	cin>>num;
	
	int sum = sumOf1ToN(num);
	
	cout<<"Sum from 1 to "<<num<<" = "<<sum;
}
