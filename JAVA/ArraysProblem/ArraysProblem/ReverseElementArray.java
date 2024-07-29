import java.util.Scanner;

class ReverseElementArray
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array");
   int size=sc.nextInt();

   int arr[]=new int[size];
   System.out.println("Enter "+size+" of elements");

   for(int i=0; i<arr.length; i++)
   {
	  arr[i]=sc.nextInt();
   }

   System.out.println("Before reversing the array");
   System.out.print("[ ");
   for(int i=0; i<arr.length; i++)
   {
	   System.out.print(arr[i]+" ");
   }
    System.out.print("]");
    System.out.println();

    for(int i=0; i<arr.length/2; i++)
    {
		int temp=arr[i];
		arr[i]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
	}
	System.out.println("After reversing the array");
	   System.out.print("[ ");
	   for(int i=0; i<arr.length; i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	    System.out.print("]");
    System.out.println();
  }
}