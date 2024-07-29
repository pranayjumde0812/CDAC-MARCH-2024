import java.util.Scanner;

class InsertOnSpecifiedIndexArray
{
 public static void main (String [] args)
 {
  int arr[]={10,20,30,40,50};
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the index to insert element");
  int index=sc.nextInt();
  System.out.println("Enter the element");
  int element=sc.nextInt();

   int narr[]=insertElement(arr,index,element);
   for(int i=0; i<narr.length;i++)
   {
      System.out.print(narr[i]+" ");
   }
   System.out.println();
 }

 static int[] insertElement(int arr[], int in, int ele)
 {
   if(in>arr.length || in<0)
   {
	  System.out.println("Invalid Index");

	  return arr;
   }
   else
   {
	   int narr[]=new int[arr.length+1];

	   for(int i=0; i<in; i++)
	   {
		 narr[i]=arr[i];
	   }

	   narr[in]=ele;

	   for(int i=in; i<arr.length; i++)
	   {
		  narr[i+1]=arr[i];
	   }
	   return narr;
   }
 }
}