import java.util.Scanner;

class SelectionSortProblem
{

	static int [] selectionSortMethod(int arr[])
	{

      for(int i=0; i<arr.length; i++)
	  {
        for(int j=i+1; j<arr.length; j++)
        {
			if(arr[i]>arr[j])
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
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

      int [] result=selectionSortMethod(arr);

       for(int i=0; i<arr.length; i++)
	   {
		  System.out.print(result[i]+" ");
	   }

   }
}