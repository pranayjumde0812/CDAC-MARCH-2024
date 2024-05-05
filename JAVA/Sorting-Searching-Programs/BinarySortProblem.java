import java.util.Scanner;

class BinarySortProblem
{

	static int binarySortMethod(int arr[],int search)
	{
	   int beg=0;
	   int end=arr.length-1;
	   int mid;

		       for(int i=0; i<arr.length; i++)
			   {
			     mid=(beg+end)/2;

			     if(search==arr[mid])
			     {
					 return mid;
				 }
				 else if (search<arr[mid])
				 {
					 end=mid-1;
				 }
				 else if (search>arr[mid])
				 {
				 	beg=mid+1;
				 }
	           }

	           return -1;
	}
   public static void main(String [] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of array: ");
	   int n=sc.nextInt();
	   int arr[] = new int[n];

	   System.out.println("Enter the "+n+" elements in array");

	   for(int i=0; i<arr.length; i++)
	   {
		   arr[i]=sc.nextInt();
	   }

	   System.out.println("Enter the element to be search");
	   int search=sc.nextInt();

      int result=binarySortMethod(arr,search);

      if(result==-1)
          System.out.println("Element is not present in array");
      else
          System.out.println("Element "+search+" is present in array at index s"+result);

   }
}