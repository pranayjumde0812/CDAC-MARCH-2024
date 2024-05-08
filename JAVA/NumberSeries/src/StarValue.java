import java.util.Scanner;
import java.lang.String;

//                      MOST IMPORTANT QUE GIVEN BY SIR
// TO FIND THE STAR POSITION (INDEX) AND REPLACE IT WITH THE SAME UNIT POSITION OF RESULT
class StarValue {

    static long divideInput(String s, int in) {
        int a = s.length();

        String b = s.substring(0, in);
        String c = s.substring(in + 1, a);

        long d = Integer.parseInt(b.concat(c));
        System.out.println("After removing * = " + d);
        long res = d / 3;
        System.out.println("After dividing the Number By 3 = " + res);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which contain Star in it = ");
        String num = sc.nextLine();

        int index = num.indexOf('*');
        System.out.println("Index Of * = " + index);

        long y = divideInput(num, index);

        String str1 = Long.toString(y);

        char ch = str1.charAt(str1.length() - index);
        System.out.println("Number displayed at the position of * from UNIT positioning = " + ch);

    }


}