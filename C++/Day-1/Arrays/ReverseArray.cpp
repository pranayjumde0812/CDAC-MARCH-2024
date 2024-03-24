// Reverse the array element

#include <iostream>

using namespace std;

int main() {
	
	int arr[10]	= {39,88,888,54,66,74,21,43,99,72};
	
	int lengthOfArray = sizeof(arr)/sizeof(int);
	
	int temp = 0;
	
	for(int i = lengthOfArray - 1 ; i >= 0  ; i-- ) {
			
			cout<<arr[i]<<" ";
    }
	
	
	return 0;
	
}

