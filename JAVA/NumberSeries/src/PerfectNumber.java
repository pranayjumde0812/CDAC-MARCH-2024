import java.util.Scanner;

class PerfectNumber
{
 public static void main(String [] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n=sc.nextInt();
  int sum=1;

  for(int i=2; i <=n/2; i++)
  {
    if(n%i==0)
     sum=sum+i;
  }

  if(sum==n)
   System.out.println(n+" is a Perfect number");
  else
   System.out.println(n+" is not a Perfect number");
 }
}