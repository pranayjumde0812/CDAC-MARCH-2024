package thread2;

public class MyThread implements Runnable {

    /*
     *  Rule - method overriding and exception handling
     *  Overriding form of the method (sub class)
     */

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");

        try {
            //B.L -- for loop (10)
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(5500);
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName());
            e.printStackTrace();
        }

    }
}
