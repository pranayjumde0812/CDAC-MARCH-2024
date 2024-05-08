package FactorialNumber;

public class FactorialNumberMain {
    public static void main(String[] args) {

//        FactorialNumber.findFactorialOfNumber();  // when method is static we can call by this class name . method name

        GetFactorialNumber factorialNumber = new GetFactorialNumber();  // it doesn't work when method is static

//        factorialNumber.getNum(4);   /// this works when class method is non-static


        factorialNumber.findFactorialOfNumber();

        /////////////////////////////////////////////////////////////

        GetFactorialNumberRange factorialNumberRange = new GetFactorialNumberRange();
        factorialNumberRange.factorialOfGivenRange();

    }

}
