/*How to calculate sum of digits present in given String also find count of digits and string after removing digits*/

import java.util.Scanner;

class SumOfDigitsinString
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String containing digits and character: ");
   String s=sc.nextLine();

   char ch[]=s.toCharArray();

   int sum=0;
   int count=0;
   String nstr=" ";

   for(int i=0; i<ch.length; i++)
   {
	 if(ch[i]>=48 && ch[i]<=57)
	 {
		 sum=sum+(ch[i]-48);
		 count++;
	 }

      else
	  nstr=nstr+ch[i];
   }

     System.out.println("Sum of digits = "+sum);
   	 System.out.println("Number of digits present in string = "+count);
	 System.out.println("String after removing digits = "+nstr);
 }
}