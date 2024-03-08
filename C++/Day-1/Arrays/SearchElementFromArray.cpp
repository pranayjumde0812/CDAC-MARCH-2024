#include <iostream>

using namespace std;

int main() {
	
	int arr[10]	= {39,8,41,5,6,54,21,8,98,32};
	
	int lengthOfArray = sizeof(arr)/sizeof(int);
	
	int elementToBeSearch = 0;
	
	cout<< "Enter number to be search in array : "<<endl;
	
	cin>>elementToBeSearch;
	
	for(int i = 0 ; i < lengthOfArray  ; i++ ) {
			
			if(arr[i] == elementToBeSearch){
				
				cout<<elementToBeSearch<<" is present at "<<i<<" index";
				break;
				
			}	
    }
    
    
	return 0;
}




