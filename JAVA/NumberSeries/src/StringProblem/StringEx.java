package StringProblem;

public class StringEx {
    public static void main(String[] args) {
        String s1 = "pranay";
        String s2 = "pranay";


        String s3 = new String("pranay");
        String s4 = new String("pranay");


        String s5= new String(s2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());


        if (s5 == s2) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        if (s5.equals(s2)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }


//        if (s1 == s2) {
//            System.out.println("True");
//        } else {
//            System.out.println("false");
//        }
//
//        if (s2.equals(s3)) {
//            System.out.println("True");
//        } else {
//            System.out.println("false");
//        }
//
//        if (s3 == s4) {
//            System.out.println("True");
//        } else {
//            System.out.println("false");
//        }
    }
}
