import java.util.*;

public class EvenOddCommandLine {

	public static void main(String [] args){
		
		if (args.length == 0){
			System.out.println("No Argument Provided");
		}else {
			System.out.println("Arguments Passed");
			int num = Integer.parseInt(args[0]);
			
			if(num %2 == 0){
				System.out.println("number is even");
			}else{
				System.out.println("number is odd");
			}
		}
	}
}