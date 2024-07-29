/*Count number of times a character occured in given String  and print String after removing duplicate values*/

import java.util.Scanner;

class CountOccurance
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String ");
    String str=sc.nextLine();

    int n=str.length();

    char ch[]=str.toCharArray();

    for(int i=0; i<n; i++)
    {
		int count=1;
		for(int j=i+1; j<n; j++)
		{
		 if(ch[i]==ch[j])
		 {
			count ++;

			int k=j;

			while(k<n-1)
			{
				ch[k]=ch[k+1];
				k++;
			}
			n--;
			j--;
		 }
		}
		System.out.println("The character "+ch[i]+" occured for "+count+" times");
	}

	String nstr=" ";
	for(int i=0; i<n; i++)
	{
		nstr=nstr+ch[i];
	}
	 System.out.println(nstr);
  }
}