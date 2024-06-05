package Day_10;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//        List<Integer> intList = Arrays.asList(120, 23, 88, 88, 76, 2);
        // create stream of ints range 1-50 and display all nos
        IntStream.range(1, 51).forEach(i -> System.out.print(i + " "));
        System.out.println("\n=============================================================");
        // display odd numbers in the range of 1-50
        IntStream.rangeClosed(1, 50).filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + " "));

    }
}