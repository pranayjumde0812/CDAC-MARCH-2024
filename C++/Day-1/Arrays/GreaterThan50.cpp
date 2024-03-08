#include <iostream>

using namespace std;

int main(){
	
	int arr[10]	= {39,88,888,54,66,74,21,43,99,72};
	
	int lengthOfArray = sizeof(arr)/sizeof(int);
	
	for(int i = 0; i < lengthOfArray; i++){
		
		if(arr[i]>50){
			cout<<arr[i]<<" ";
		}
		
	}
	
	return 0;
}




