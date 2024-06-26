package Stack_Using_LinkedList;

public class LinkedListStack {

    public static void main(String[] args) {
        StackLL<Integer> stackLL = new StackLL<>();
        stackLL.push(100);
        stackLL.push(101);
        stackLL.push(103);
        stackLL.push(105);

        stackLL.display();

        System.out.println(stackLL.pop());
        stackLL.display();
        System.out.println(stackLL.peek());
        stackLL.display();

    }

}
