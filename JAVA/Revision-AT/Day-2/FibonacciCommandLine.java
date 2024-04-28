import java.util.*;

public class FibonacciCommandLine {

	public static void main(String [] args){
		
		if (args.length == 0){
			System.out.println("No Argument Provided");
		}else {
			System.out.println("Arguments Passed");
			int num = Integer.parseInt(args[0]);
			
			int n1 = 0, n2 = 1, n3;
			System.out.print(n1+" "+n2+" ");
			for (int i = 2 ; i < num ; i++){
				n3 = n1 + n2;
				System.out.print(n3+" ");
				n1 = n2;
				n2 = n3;
			}
		}
	}
}