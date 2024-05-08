import java.util.Scanner;

class PalindromeNummber
{
 public static void main(String [] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n=sc.nextInt();

  int rem,rev=0;
  int temp=n;

  while(n>0)
  {
	 rem=n%10;
	 rev=(rev*10)+rem;
	 n=n/10;
  }
  if(rev==temp)
  System.out.println("Given number is Palindrome");
  else
    System.out.println("Given number is not a Palindrome");

 }
}