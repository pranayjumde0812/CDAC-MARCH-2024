import java.util.*;

class CreateArray {
	public static void main(String [] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter size of an array : ");
	 int size = sc.nextInt();
	 
	 int arr[] = new int[size];
	 
	 for(int i=0; i < arr.length; i++){
		 System.out.println("Enter "+(i+1)+" element of an array : ");
		 arr[i] = sc.nextInt();
	 }
	 
	 for(int i : arr){
		 System.out.print(i+" ");
	 }
	}
}