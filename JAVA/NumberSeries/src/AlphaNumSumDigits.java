import java.util.Scanner;

class AlphaNumSumDigits
{
  public static void main(String [] args)
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter alpha numeric string");
   String s=sc.nextLine();

   int sum=0;

   char ch[] =s.toCharArray();

   for(int i=0;i<ch.length;i++)
   {
	   if(ch[i]>=48 && ch[i]<=57)
	   {
		   sum=sum+ch[i]-48;
	   }
   }

   System.out.println("The sum of numbers present in ALPHA-NUMERIC String = "+sum);
  }
}