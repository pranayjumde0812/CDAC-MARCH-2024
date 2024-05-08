public class FibonacciSeries {

    public static void main(String[] args) {

        int range = 10;

        FibonacciSeries fb = new FibonacciSeries();
        fb.fibonacciSeries(range);
        fb.sumOfFibonacciSeries(range);

    }

    public void fibonacciSeries(int range) {

        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= range; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    public void sumOfFibonacciSeries(int range) {

        int n1 = 0, n2 = 1, n3;
        int sum = 0;
        for (int i = 2; i <= range; i++) {
//            sum = sum + (n1 + n2);
            n3 = n1 + n2;
            sum = sum + n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sum);
    }

}
