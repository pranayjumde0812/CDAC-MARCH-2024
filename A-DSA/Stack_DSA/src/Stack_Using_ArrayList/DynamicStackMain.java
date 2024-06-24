package Stack_Using_ArrayList;

public class DynamicStackMain {

    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack();

        dynamicStack.push(10);
        dynamicStack.push(12);
        dynamicStack.push(13);
        dynamicStack.push(14);
        dynamicStack.push(15);
        dynamicStack.push(16);

        dynamicStack.display();
        System.out.println(dynamicStack.pop());
        dynamicStack.display();
        System.out.println(dynamicStack.peek());

    }
}
