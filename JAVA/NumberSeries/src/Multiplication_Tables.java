import java.util.Scanner;

class Multiplication_Tables{

 public static void main(String [] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter digit of Which table you to print");
 int n=sc.nextInt();

  for(int i=1; i<=n; i++){

     for(int j=1; j<=10; j++){

	  int multi=j*i;
	  System.out.println(j+"*"+i+"="+multi+"\t");
   }
  }
   System.out.println();
 }
}
