package thread2;

public class Tester {
    public static void main(String[] args) {

        try {

            MyThread myThread1 = new MyThread();
            Thread t1 = new Thread(myThread1, "One");
            Thread t2 = new Thread(myThread1, "Two");
            Thread t3 = new Thread(myThread1, "Three");
            Thread t4 = new Thread(myThread1, "Four");

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
            System.out.println(Thread.currentThread().getName());
            e.printStackTrace();
        }

    }
}
