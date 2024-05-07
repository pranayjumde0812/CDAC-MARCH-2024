package functional_streams;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("all nos 1-50");
		// create stream of ints in range 1-50 n display all nos
		IntStream.range(1, 51) //src 
		.forEach(i -> System.out.print(i+" "));//terminal op.
		//display odd nos in the range of 1-50
		System.out.println();
		System.out.println("all odd nos 1-50");
		IntStream.rangeClosed(1, 50) //src  Int stream 1--50
		.filter(i -> i % 2 != 0) //IntStream --odd no 1 3 5 ...49 --intermediate op
		.forEach(i -> System.out.print(i+" "));//terminal op

	}

}
