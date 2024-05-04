import java.util.Scanner;

class AbsoluteDiff
{
  public static void main(String[] args)
  {

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Number:  ");
   int num=sc.nextInt();
   System.out.println("Your entered number is:  "+num);

   int y=51, diff;

   diff=num-y;

   if(diff<0)
   {
	 diff=-diff;
	 System.out.println("Absoulte diff = "+diff);
   }
   else if(num>51)
     {
   	  diff=diff*3;
   	  System.out.println("Absoulte diff = "+diff);
     }
   else
      System.out.println("Absoulte diff = "+diff);

  }
}