class SwapNumberWithout3rdVAriable
{
 public static void main(String [] args)
 {
  int a=50;
  int b=100;

  System.out.println("Before swapping Two numbers");
  System.out.println("a="+a);
  System.out.println("b="+b);

  a=a+b;
  b=a-b;
  a=a-b;

  System.out.println("After swapping Two numbers");
  System.out.println("a="+a);
  System.out.println("b="+b);
 }
}