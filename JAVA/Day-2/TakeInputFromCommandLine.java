import java.util.*;

public class TakeInputFromCommandLine {

	public static void main(String [] args){
		
		if (args.length == 0){
			System.out.println("No Argument Provided");
		}else {
			System.out.println("Arguments Passed");
//			int num = Integer.parseInt(args);
			System.out.println(args);
		}
	}
}