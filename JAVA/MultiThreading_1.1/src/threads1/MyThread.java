package threads1;

public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    /*
     *  Rule - method overriding and exception handling
     *  Overriding form of the method (sub class)
     */

    @Override
    public void run() {
        System.out.println(getName() + " Started");

        try {
            //B.L -- for loop (10)
            for (int i = 0; i < 10; i++) {
                Thread.currentThread().setName(name);
                System.out.println(getName() + " " + i);
                Thread.sleep(5500);
            }
        } catch (Exception e) {
            System.out.println(getName());
            e.printStackTrace();
        }

    }
}
