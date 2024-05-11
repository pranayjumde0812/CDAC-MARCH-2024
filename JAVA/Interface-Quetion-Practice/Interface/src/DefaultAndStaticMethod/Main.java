package DefaultAndStaticMethod;

public class Main {
    public static void main(String[] args) {

        A ref1 = new A();
        B ref2 = new B();
        Run ref3 = new B();

        ref1.view();
        ref1.test();

        ref2.view();
        ref2.test();

        ref3.test();

        Run.count();
    }
}