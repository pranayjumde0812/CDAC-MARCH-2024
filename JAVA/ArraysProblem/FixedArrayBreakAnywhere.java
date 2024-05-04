/*WAP where one fixed array of length 10 is present but we want to break the array where ever we want like inputing 6 values and the break*/

import java.util.Scanner;

class FixedArrayBreakAnywhere
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
   int arr []=new int[10];
   System.out.println("Enter the limit (less than 10) of array where you want to break array");
   int limit=sc.nextInt();

   System.out.println("Enter the elements in array");
   for(int i=0; i<limit; i++)
   {
	 arr[i]=sc.nextInt();
   }

   for(int i=0; i<limit; i++)
   {
   	 System.out.print(arr[i]+" ");
   }
 }
}