package functional_streams;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] data= {1,2,3,45,67,-100,5,6,12};
		//attach IntStream to the array n display even elems
//		//source (int[]) --> terminal (forEach)
		Arrays.stream(data) //src : IntStream -- all ints
		.filter(i -> i % 2 == 0)	//IntStream -- even nos
		.forEach(i -> System.out.print(i+" "));//terminal op.

	}

}
