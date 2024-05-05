import java.util.Scanner;

class BubbleSortProblem
{
	static int [] bubbleSortMethod(int arr[])
	{

      for(int i=1; i<arr.length ; i++)
	  {
        for(int j=0; j<arr.length-i; j++)
        {
			if(arr[j] > arr[j+1])
			{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		    }
		}
	  }
	   return arr;
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

      int [] result=bubbleSortMethod(arr);

       for(int i=0; i<arr.length; i++)
	   {
		  System.out.print(result[i]+" ");
	   }

   }
}