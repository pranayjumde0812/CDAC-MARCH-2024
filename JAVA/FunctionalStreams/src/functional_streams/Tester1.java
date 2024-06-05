package functional_streams;

import java.util.Arrays;
import java.util.List;

public class Tester1 {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 11, 77, 9 };

		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

		System.out.println("\n------------------------------------------------------------");

		List<Integer> list = Arrays.asList(1, 3, 7, 5, 6, 9, 4, 19, 17, 14);

		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));

		System.out.println("\n------------------------------------------------------------");

		Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));

	}

}
