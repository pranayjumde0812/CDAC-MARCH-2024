//Q2.Write a Program to sort the Array , First half in Ascending order and
//the Second in Descending order.

#include<iostream>

using namespace std;

int main(){
	
	int arr [6] = {2, 7, 1, 90, 11, 88};
	
	int lengthOfArray = sizeof(arr) / sizeof(int);
	
	for(int i= 0; i < lengthOfArray; i++){
		
		for(int j = i+1 ; j < lengthOfArray; j++){
			
			if(arr[i] > arr[j]){
				int temp = arr[i];
		    	arr[i] = arr[j];
		 	    arr[j] = temp;
			}
		}	
	} 
	
	for(int i = 0; i < lengthOfArray; i ++){
	  cout<<arr[i]<<" ";
	}
	
	
	for(int i = lengthOfArray/2 ; i < lengthOfArray ; i++){
		
	   for(int j = i+1 ; j < lengthOfArray ; j++){
	   	
	   	int temp = 0;
	   	if(arr[i]  < arr[j]){
	   		
		    temp = arr[j];
		    arr[j] = arr[i];
		 	arr[i] = temp;
		 	
	   }
	} 
}

cout<<"\n";

	for(int i = 0; i < lengthOfArray; i ++){
	  cout<<arr[i]<<" ";
	}
	
	return 0;
	
	}

