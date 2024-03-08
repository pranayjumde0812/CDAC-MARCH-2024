#include<iostream>
using namespace std;

int main(){
	
	int arr1[4] = {4,7,9,2};
	int arr2[6] = {3,90,77,6,8,1};
	
	int lengthOfArray1 = sizeof(arr1) / sizeof(int); 
	int lengthOfArray2 = sizeof(arr2) / sizeof(int); 
	
	int sizeOfCombinedArray = lengthOfArray1 + lengthOfArray2 ;
	
	int arr3[sizeOfCombinedArray];
	

	for (int i = 0; i < lengthOfArray1 ; i++){
		arr3[i] = arr1[i];
	}
	
	for (int i = lengthOfArray1, j=0 ; i < sizeOfCombinedArray ; i++ , j++){
		
		arr3[i] = arr2[j];
		
	}
	
	for(int i= 0 ; i < sizeOfCombinedArray ; i++ ){
		
		cout<<arr3[i]<<" ";
		
	}
	
	return 0;
	
}
