import java.util.Scanner;

public class AnagramString
{
   static String removeSpace(String s)
   {
	  char ch[]=s.toCharArray();      // Convert String to Array

	  String nstr="";
	  for(int i=0; i<ch.length; i++)
	  {
		 if(ch[i]!=' ')
		 {
			nstr=nstr+ch[i];
		 }
	  }
	  return nstr;
   }

   static String toLowerCase(String s)
      {
   	  char ch[]=s.toCharArray();      // Convert String to lower Case

   	  String nstr="";
   	  for(int i=0; i<ch.length; i++)
   	  {
   		if(ch[i]>=65 && ch[i]<=90)
		{
		  nstr=nstr+((char)(ch[i]+32));
		}
	    else
		  nstr=nstr+ch[i];
   	  }
   	  return nstr;
   }

   static String sort(String s2)
   {
	   char [] ch=s2.toCharArray();

	  for(int i=0; i<ch.length; i++)
	  {
		for(int j=i+1; j<ch.length; j++)
		{
		 if(ch[i] > ch[j])
		 {
			 char temp=ch[i];
			     ch[i]=ch[j];
			     ch[j]=temp;
		 }
	    }
	  }
	   String s=new String(ch);
	   return s;
   }

  static boolean compare(String s1, String s2)
  {
	  if(s1.length() != s2.length())
	  {
		return false;
	  }
	  else
	  s1=toLowerCase(s1);
	  s2=toLowerCase(s2);
	  s1=sort(s1);
	  s2=sort(s2);

	  char[] ch1=s1.toCharArray();
	  char[] ch2=s2.toCharArray();

	for(int i=0; i<ch1.length; i++)
	{
		if(ch1[i] != ch2[i])
		{
			return false;
		}
	}
	return true;
  }
  public static void main(String [] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter First string: ");
   String str1=sc.nextLine();
   System.out.println("Enter Second string: ");
   String str2=sc.nextLine();

   String s1=removeSpace(str1);
   String s2=removeSpace(str2);

   boolean b=compare(s1,s2);

   if(b)
      System.out.println("Given String is Anagram");

   else
      System.out.println("Given String is not Anagram");
  }
}