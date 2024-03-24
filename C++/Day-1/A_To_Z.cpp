//Lab : Print A to Z characters

#include <iostream>

using namespace std;

int main(){
	
	cout<<"First Way"<<endl; 
	
	for(int i = 65; i <= 90 ; i++){
		
		cout<<(char)i<<" ";
	}
	
	cout<<"\nSecond Way"<<endl;
	
	for(int i = 65; i <= 90 ; i++){
		
		char ch = i;
		
		cout<<ch<<" ";
	}
	
	return 0;
}
