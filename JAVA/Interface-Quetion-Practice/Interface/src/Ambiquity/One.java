package Ambiquity;

public interface One {

    int o1 = 1;

    default void myName(){
        System.out.println("My name is One");
    }

}
