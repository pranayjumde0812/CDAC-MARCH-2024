public class StrongNumber {


    public static void main(String[] args) {
        int num = 145;
        int rem;
        int sum = 0;

//        System.out.println(fact(5));

        while (num != 0) {
            rem = num % 10;
            sum = sum + fact(rem);
            num = num / 10;
        }

        System.out.println(sum);
    }

    private static int fact(int rem) {
        int fact = 1;

//        while(rem > 0){
//            fact = fact * rem ;
//            rem--;
//        }

        for (int i = rem; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
