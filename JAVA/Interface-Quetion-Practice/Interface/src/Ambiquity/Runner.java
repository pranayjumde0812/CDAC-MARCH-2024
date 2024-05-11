package Ambiquity;

public class Runner implements One, Two {


    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.myName();

        System.out.println(One.o1);
    }

    @Override
    public void myName() {
        One.super.myName();
    }

}
