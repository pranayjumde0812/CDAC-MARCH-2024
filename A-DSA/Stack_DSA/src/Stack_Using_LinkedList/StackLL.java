package Stack_Using_LinkedList;

public class StackLL<T> {

    private Node top;

    public StackLL() {
        this.top = null;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean push(T data) {
        Node node = new Node(data);

        if (isEmpty()) {
            top = node;
            return true;
        }

        node.next = top;
        top = node;
        return true;
    }

    public T pop() {

        if (isEmpty()) {
            return null;
        }

        T value = top.data;

        top = top.next;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return top.data;
    }


    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
