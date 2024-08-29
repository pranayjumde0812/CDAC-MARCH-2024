package Arrays;

public class LargestElementFromArray {

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 7, 8, 3};

        // Brute Force
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("The largest element = " + arr[arr.length - 1]);

        // Optimized Solution O(N)
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element = " + largest);

    }
}
