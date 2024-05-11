package DefaultAndStaticMethod;

public class B implements Run {
    @Override
    public void test() {
        System.out.println("This is test method in DefaultAndStaticMethod.B");
    }

    @Override
    public void view() {
        Run.super.view();
    }
}
