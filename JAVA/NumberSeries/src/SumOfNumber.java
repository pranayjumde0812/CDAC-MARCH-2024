public class SumOfNumber {
    public static void main(String[] args) {
        int n = 123;

        int sum = 0;

        while (n > 0) {

            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
