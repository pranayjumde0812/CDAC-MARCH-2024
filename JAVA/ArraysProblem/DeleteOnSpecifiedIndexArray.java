import java.util.Scanner;

class DeleteOnSpecifiedIndexArray
{
 public static void main (String [] args)
 {
  int arr[]={10,20,30,40,50};
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the index to delete element");
  int index=sc.nextInt();

   int narr[]=deleteElement(arr,index);
   for(int i=0; i<narr.length;i++)
   {
      System.out.print(narr[i]+" ");
   }
   System.out.println();
 }

 static int[] deleteElement(int arr[], int in)
 {
   if(in>arr.length || in<0)
   {
	  System.out.println("Invalid Index");

	  return arr;
   }
   else
   {
	   int narr[]=new int[arr.length-1];

	   for(int i=0; i<in; i++)
	   {
		 narr[i]=arr[i];
	   }

	   for(int i=in; i<arr.length-1; i++)
	   {
		  narr[i]=arr[i+1];
	   }
	   return narr;
   }
 }
}