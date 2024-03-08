//10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
#include<iostream>
using namespace std;

int findPower(int n, int m);

int main(){
	
	int n,m;
	
	cout<<"Enter value of n = ";
	cin>>n;
	cout<<"Enter value of m = ";
	cin>>m;
	
	int nPowerM = findPower(n,m);
	cout<<n<<" power "<<m<<" = "<<nPowerM;
	
	
	return 0;
}

int findPower(int n, int m){
	
	int power = 1;
	
	for(int i = 1 ; i <= m ;i++){
		
		power =  power * n;
	}
	
	return power;
}

