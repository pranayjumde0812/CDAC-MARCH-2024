package January_29;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        int a = 100, b = 30, c = 21;

//        int largestNumber = 0;
//
//        if (a > b && a > c) {
//            largestNumber = a;
//        } else if (b > a && b > c) {
//            largestNumber = b;
//        } else if (c > a && c > b) {
//            largestNumber = c;
//        }
//
//        System.out.println(largestNumber);

        /////////////////////////////////////////////////////////////////////
        int largestNum1 = a > b ? a : b;

        int largestNum2 = c > largestNum1 ? c : largestNum1;

        System.out.println(largestNum2);

        ////////////////////////////////////////////////////////////////////

        int largestNum = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println(largestNum);

    }
}
