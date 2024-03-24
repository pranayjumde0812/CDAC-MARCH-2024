// Sum of array element

#include <iostream>

using namespace std;

int main(){
	
	int arr[6] = {21,3,66,78,4,9};
	
	int lengthOfArray = sizeof(arr)/sizeof(int);
	
	int sum = 0;
	
	for(int i = 0; i < lengthOfArray ; i++){
		
		sum = sum + arr[i];
		
	}
	
	cout<<"Sum of array elements = "<<sum;
	
	return 0;
}
