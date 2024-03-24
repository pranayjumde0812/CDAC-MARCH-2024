#include <iostream>

using namespace std;

int main() {
	
	int arr[10]	= {39,8,41,5,6,54,21,8,98,32};
	
	int lengthOfArray = sizeof(arr)/sizeof(int);
	
	int temp = 0;
	
	for(int i = 0 ; i < lengthOfArray  ; i++ ) {
			
			arr[i] = arr[i] * 2;
    }
    
    
    for(int i = 0 ; i < lengthOfArray  ; i++ ) {
			
			cout<<arr[i]<< " ";
    }
		
	return 0;
	
}

