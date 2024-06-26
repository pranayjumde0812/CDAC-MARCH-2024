public class LinkedList {

    private Node head;
    int size;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
        head = null;
        this.size = 0;
    }


    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head != null) {
            node.next = head;
            head = node;
            return;
        }
        head = node;
        size++;
    }

    public void insertLast(int value) {

        if (head == null) {
            insertFirst(value);
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        Node node = new Node(value);

        last.next = node;
        size++;
    }


    public void insert(int value, int position) {
        if (position <= 0 || (head == null && position > 1)) {
            return;
        }

        if (position == 1) {
            insertFirst(value);
            return;
        }

        if (position == size + 1) {
            insertLast(value);
            return;
        }

        Node node = new Node(value);

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int deleteVal = head.data;
        head = head.next;
        size--;
        return deleteVal;
    }

    public int deleteLast() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        int deleteVal = temp.next.data;

        temp.next = null;
        size--;

        return deleteVal;
    }

    public int delete(int position) {
        if (position == 1) {
            return deleteFirst();
        }

        if (position == size) {
            return deleteLast();
        }

        Node prev = head;

        for (int i = 1; i < position - 1; i++) {
            prev = prev.next;
        }

        int del = prev.next.data;

        prev.next = prev.next.next;

        return del;
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
