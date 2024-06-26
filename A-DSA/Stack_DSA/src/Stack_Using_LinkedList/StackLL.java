package Stack_Using_LinkedList;

public class StackLL<T> {

    private Node head;

    public StackLL() {
        this.head = null;
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
        return head == null;
    }

    public boolean push(T data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
            return true;
        }

        node.next = head;
        head = node;
        return true;
    }

    public T pop() {

        if (isEmpty()) {
            return null;
        }

        T value = head.data;

        head = head.next;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return head.data;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
