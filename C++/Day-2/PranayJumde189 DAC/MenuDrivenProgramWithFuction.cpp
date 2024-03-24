// menu driven program with functions

#include<iostream>
//#include<math>
using namespace std;

void addition(int a, int b)
{
	int c=a+b;
	cout<<"Addition of (a+b) = "<<c<<endl;
}


void substraction(int a, int b){
		int c=a-b;
	cout<<"Substration of (a-b)="<<c<<endl;
}

void multiplication(int a, int b){
		int c=a*b;
	cout<<"Multiplication of (a*b)="<<c<<endl;
}
void division(int a, int b){
		float c=a/b;
	cout<<"Division of (a/b)="<<c<<endl;
}

int main()
{
  int a,b;
  cout<<"Enter first Integer: "<<endl;
    cin>>a;
    cout<<"Enter second Integer: "<<endl;
    cin>>b;
    
    cout<<"Enter the choice for operation : "<<endl;
    cout<<"1 : Addition || 2 : Substraction || 3 : Multiplication || 4 : Division "<<endl;
    
    int choice;
    cin>>choice;
    
    switch(choice){
    	case 1 :
		        addition(a,b);
    			break;
    	
    	case 2 : 
				substraction(a,b);
    			break;
    	
    	case 3 :
				multiplication(a,b);
    			break;
    	
    	case 4 : 
				division(a,b);
    			break;
    	
    	default :
    			cout<<"Invalid Choice !!!";
    			break;
	}
    
    return 0;
}
