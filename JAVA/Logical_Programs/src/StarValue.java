import java.util.Scanner;
import java.lang.String;
                                  //              MOST IMPORTANT QUE GIVEN BY SIR
                                 // TO FIND THE STAR POSTION AND REPLACE IT WITH THE SAME POSITION OF RESULT
class StarValue
{

  static int checkIndex(String a)
  {
	 int ind =a.indexOf('*');

	 return ind;
  }

  static int divideInput(String s, int in)
  {
    int a=s.length();

     String b=s.substring(0 , in);
     String c=s.substring(in+1 , a);

     int d=Integer.parseInt(b.concat(c));
     System.out.println("After removing * = "+d);
     int res=d/3;
	 System.out.println("After dividing the Number By 3 = "+res);

     return res;
  }

  public static void main(String [] args)
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number which contain Star in it = ");
	 String num=sc.nextLine();

	 StarValue sv = new StarValue();
	 int x =sv.checkIndex(num);
	 System.out.println("Index Of * = "+x);
	 int y =sv.divideInput(num,x);

	 int lenth=num.length();
	// System.out.println("length  = "+lenth);

    String str1 = Integer.toString(y);
   // System.out.println("Result = "+str1);
    String rev=reverse(str1); // REVERSE VALUE OF STR1

    char ch=rev.charAt(lenth-x-1);
    System.out.println("Number displayed at the position of * from UNIT positioning = "+ch);

  }

 // FOR REVERSING THE STR1 STRING
  public static String reverse(String source){
          if(source == null || source.isEmpty()){
              return source;
          }
          String reverse = "";
          for(int i = source.length() -1; i>=0; i--){
              reverse = reverse + source.charAt(i);
          }

          return reverse;
      }

}