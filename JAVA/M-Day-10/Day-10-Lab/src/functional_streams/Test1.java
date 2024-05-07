package functional_streams;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] data= {1,2,3,45,67,-100,5,6,12};
		//attach IntStream to the array n display elems
		//source (int[]) --> terminal (forEach)
		Arrays.stream(data) //src : IntStream
		.forEach(i -> System.out.print(i+" "));//terminal op.

	}

}
