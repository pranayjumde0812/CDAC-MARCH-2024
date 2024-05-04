 /*To find bigger number and smaller number in array*/

 import java.util.Scanner;

 class BigNumSmallNum
 {
	 static void display(int arr[])
	 {
		 System.out.println("After inserting the elements to array");
		 for(int i=0; i<arr.length; i++)
		 {
			 System.out.println(i+"-->"+arr[i]+" ");
		 }
	 }

	 static int [] sort(int arr[])
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
      System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int arr[]=new int[size];

      System.out.println("Enter "+size+" elements ");

      for(int i=0; i<arr.length; i++)
      {
		 arr[i]=sc.nextInt();
	  }
	  display(arr);
	  arr=sort(arr);

	  System.out.println(arr[0]+" ---> Smallest Element");
	  System.out.println(arr[arr.length-1]+" ---> Biggest Element");
    }
 }