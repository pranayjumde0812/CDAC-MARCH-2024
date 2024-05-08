package ReverseNumber;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345234;
        int rem;

        int revNum = 0;

        while (number != 0) {
            rem = number % 10;

            revNum = revNum*10 + rem;

            number = number / 10;
        }

        System.out.println(revNum);
    }
}
