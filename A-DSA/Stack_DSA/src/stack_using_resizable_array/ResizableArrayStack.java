package stack_using_resizable_array;

public class ResizableArrayStack {
    public static void main(String[] args) {
        ResizableArray<Integer> array = new ResizableArray<>(4);

        array.push(30);
        array.push(34);
        array.push(35);
        array.push(66);
        array.push(77);
        array.push(88);
        array.push(99);

        array.displayStack();

        System.out.println(array.pop());
        array.displayStack();
        System.out.println(array.peek());
        array.displayStack();
    }
}
