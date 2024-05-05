package January_29;

public class SwappingOfTwoNumbers {

    public static void main(String[] args) {

        //  Logic 1 : By using third variable
        int a = 5, b = 11;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a = " + a + ", b = " + b);

        //  Logic 2 : Without using 3rd variable
        int c = 20, d = 15;

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("After swapping c = " + c + ", d = " + d);

        //  Logic 3 : Without using 3rd variable and without + and -
        int e = 3, f = 7;

        e = e * f;
        f = e / f;
        e = e / f;

        System.out.println("After swapping e = " + e + ", f = " + f);

        //  Logic 4 : By using XOR operator
        int g = 11, h = 19;

        g = g ^ h;
        h = g ^ h;
        g = g ^ h;

        System.out.println("After swapping g = " + g + ", h = " + h);


        //  Logic 5 : by using single statement
        int p = 8, m = 14;

        m = p + m - (p = m);

        System.out.println("After swapping p = " + p + ", m = " + m);


    }
}
