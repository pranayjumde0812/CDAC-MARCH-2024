package DefaultAndStaticMethod;

public interface Run {

    void test();

    static void count(){
        System.out.println("This is static count method");
    }

    default void view(){
        System.out.println("This is default method");
    }
}
