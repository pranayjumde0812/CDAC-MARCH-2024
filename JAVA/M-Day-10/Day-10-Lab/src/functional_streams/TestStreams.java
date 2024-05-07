package functional_streams;

import java.util.stream.IntStream;

public class TestStreams {

	public static void main(String[] args) {
		System.out.println("What will happen ?");
		IntStream.rangeClosed(1, 10).filter(i -> {
			System.out.println("filtering " + i);
			return i % 2 == 0;
		}).map(i -> {
			System.out.println("mapping " + i);
			return i + 1;
		});

	}

}
