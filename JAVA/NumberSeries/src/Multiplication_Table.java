import java.util.Scanner;

class Multiplication_Table{

 public static void main(String [] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter digit of Which table you to print");
 int n=sc.nextInt();

  for(int i=1; i<=10; i++){

	  int multi=n*i;
	  System.out.println(n+" * "+i+" = "+multi);
  }
 }
}
