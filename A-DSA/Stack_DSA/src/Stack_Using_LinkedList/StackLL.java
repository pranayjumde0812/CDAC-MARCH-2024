package Stack_Using_LinkedList;

public class StackLL {

    private Node head;

    public StackLL() {
        this.head = null;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean push(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
            return true;
        }

        node.next = head;
        head = node;
        return true;
    }

//    public int pop() {
//
//    }


}
