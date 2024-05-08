public class ArrayClass {
    public static void main(String[] args) {

        int[] arr = {1, 4, 32, 65, 87, 54, 87, 54, 32, 6, 54, 3, 2, 24, 76, 43, 54, 65};

        int sum = 0, square;

        for (int i = 0; i < arr.length; i = i + 3) {
            square = arr[i] * arr[i];
            sum = sum + square;
        }
        System.out.println(sum);
    }
}
