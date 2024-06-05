package threads1;

public class Tester {
    public static void main(String[] args) {

        try {
            MyThread t1 = new MyThread("One");
            MyThread t2 = new MyThread("Two");
            MyThread t3 = new MyThread("Three");
            MyThread t4 = new MyThread("Four");

            t1.start();
            t2.start();
            t3.start();
            t4.start();

            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(4000);
            }
            System.out.println("Main Over");
        } catch (Exception e) {

        }


    }
}
