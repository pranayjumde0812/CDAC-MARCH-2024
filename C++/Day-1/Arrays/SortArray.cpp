#include <iostream>

using namespace std;

int main() {
	
	int arr[10]	= {39,88,888,54,66,74,21,43,99,72};
	
	int lengthOfArray = sizeof(arr)/sizeof(int);
	
	int temp = 0;
	
	for(int i = 0; i < lengthOfArray ; i++) {
		
	    for(int j = 0; j < lengthOfArray ; j++) {
		
	    	if(arr[j] > arr[j+1]) {
		    	temp = arr[j];
		    	arr[j] = arr[j+1];
		 	    arr[j+1] = temp;
		    }		
	    }
    }
	
	for(int i = 0; i < lengthOfArray ; i++) {
		
		cout<<arr[i]<<" ";
		
	}
	
	return 0;
	
}




