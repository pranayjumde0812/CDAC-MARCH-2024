/*Write a program to Reverse the word in sentence*/

import java.util.Scanner;

class RevSentenceWord
{
   public static void main(String [] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String");

     String s=sc.nextLine();

     char ch[]=s.toCharArray();

     String rev=" ";

     for(int i=0; i<ch.length; i++)
     {
		int k=i;

		while(i<ch.length && ch[i]!=' ')
		{
			i++;
		}

		int j=i-1;

		while(k<=j)
		{
			rev=rev+ch[j];
			j--;
		}

		rev=rev+" ";
	 }

	 System.out.println(rev);
   }
}