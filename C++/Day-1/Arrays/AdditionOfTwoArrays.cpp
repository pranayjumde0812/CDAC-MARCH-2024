#include<iostream>
using namespace std;

int main(){
	
	int arr1[4] = {4,7,9,2};
	int arr2[4] = {3,90,77,4};
	
	int lengthOfArray = sizeof(arr1) / sizeof(int); 
	
	int arr3[lengthOfArray];
	

	for (int i = 0; i < lengthOfArray ; i++){	
	
			arr3[i] = arr1[i] + arr2[i];
		
	}

	
	for(int i= 0 ; i < lengthOfArray ; i++ ){
		
		cout<<arr3[i]<<" ";
		
	}
	
	return 0;
	
}
