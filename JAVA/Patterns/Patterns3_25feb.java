import java.util.Scanner;

class Patterns3_25feb
{
  public static void main(String [] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   int n=sc.nextInt();

    for(int i=0;i<n;i++)
    {
	   for(int j=0;j<n;j++)
	   {
		if (i==0 || j==0 || i==n-1 || j==n-1 )
		System.out.print("*");
		else
		System.out.print(" ");
	   }
	  System.out.println();
    }
  }
}

/*              Enter the number
                5
                *****
                *   *
                *   *
                *   *
                *****              */