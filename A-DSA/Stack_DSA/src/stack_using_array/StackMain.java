package stack_using_array;

public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(10);

        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(15);
        stack.push(111);
        stack.push(18);
        stack.push(45);
        stack.push(95);
        stack.push(66);
        System.out.println(stack.push(22));
        System.out.println(stack.push(22));

        stack.displayStack();
    }
}
