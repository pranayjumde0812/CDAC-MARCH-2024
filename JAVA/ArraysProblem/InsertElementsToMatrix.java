/*Insert elements into matrix[2-D]*/

import java.util.Scanner;

class InsertElementsToMatrix
{
	private static void display(int [][] arr)
	{
       for(int i=0; i<arr.length; i++)
       {
		   for(int j=0; j<arr[i].length; j++)
		   {
			 System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }

	}

	private static int [][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of matrix ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter "+m*n+" elements");

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		return arr;
	}


   public static void main(String [] args)
   {
	   int arr[][]=readMat();
	   display(arr);
   }
}