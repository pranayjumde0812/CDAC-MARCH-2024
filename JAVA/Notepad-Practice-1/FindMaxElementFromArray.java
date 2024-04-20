import java.util.*;

class FindMaxElementFromArray {
	public static void main(String [] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter size of an array : ");
	 int size = sc.nextInt();
	 
	 int arr[] = new int[size];
	 
	 for(int i=0; i < arr.length; i++){
		 System.out.println("Enter "+(i+1)+" element of an array : ");
		 arr[i] = sc.nextInt();
	    }
	 
	 System.out.println("Display Array Element: ");
	 for(int i : arr){
		 System.out.print(i+" ");
	    }
	 
	 for(int i = 0; i < arr.length; i++){
		 for(int j = i+1; j< arr.length; j++){
			 if(arr[i] > arr[j]){
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			    }
		    }
	    }
	
	 System.out.println("\nDisplay Sorted Array Element: ");
	 for(int i : arr){
		 System.out.print(i+" ");
	    }
		
	System.out.println("\nMaximum element from array = "+arr[arr.length-1]);
	 
	}
}