package doubly_linked_list;

public class DoublyLinkedList {

    private Node head;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // Insert First
    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
    }

    // Insert Last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    // Insert At index

    public void insert(int value, int index) {

        Node node = new Node(value);

        if (index == 0) {
            insertFirst(value);
            return;
        }

        Node last = head;

        for (int i = 1; i < index; i++) {
            last = last.next;
        }

        node.next = last.next;
        node.prev = last;

        if (node.next != null) {
            node.next.prev = node;
        }
        last.next = node;
    }

    // delete first
    public int deleteFirst() {

        int val = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }

        return val;
    }

    // delete last
    public int deleteLast() {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        int val = temp.value;

        temp.prev.next = null;

        return val;
    }

    public int delete(int index) {
        Node temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        int val = temp.value;

        Node previous = temp.prev;
        Node nextNode = temp.next;

        previous.next = nextNode;
        if (temp.next != null) {
            nextNode.prev = previous;
        }

        return val;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
