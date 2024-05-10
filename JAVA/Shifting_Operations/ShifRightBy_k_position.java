import java.util.Scanner;

class ShifRightBy_k_position
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size=sc.nextInt();

  int arr[]=new int[size];
  int narr[]=new int[arr.length];

  System.out.println("Enter the "+size+" elements in array");
  for(int i=0;i<arr.length;i++)
  {
	  arr[i]=sc.nextInt();
  }
  System.out.println("Enter the K position by which you want to shift array to the right");
  int k=sc.nextInt();
  int karr[]=new int[k];

  if(k>size)
  {
	System.out.println("Shifting position 'k' should be less than size of array");
	System.exit(0);
  }
   int j=0;
  for(int i=arr.length-k; i<arr.length; i++)
  {
	 karr[j]=arr[i];
	 j++;
  }

   for(int i=0; i<karr.length; i++)
   {
		narr[i]=karr[i];
   }

   for(int i=0; i<arr.length-k; i++)
   {
      narr[]=arr[i];
   }


   for(int i=0; i<narr.length; i++)
   {
	 System.out.print(narr[i]+" ");
   }
 }
}