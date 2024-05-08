package PrimeNumber;

public class GetRangeOfPrimeNumber {

    public boolean isPrime(int number) {

        if (number == 0 || number == 1)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
