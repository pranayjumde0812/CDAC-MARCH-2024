package singly_linked_list;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public LinkedList() {
        this.size = 0;
    }

    /////////////////////// Insert Operations ////////////////////////////

    // insert value at 1st position in LL
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }


    // insert value at last position in LL
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.next = node;
        tail = node;
        size++;
    }

    // insert value at a specific position
    public void insert(int val, int position) {
        // If the index is 1 then we can call insertFirst(val)
        if (position == 1) {
            insertFirst(val);
            return;
        }

        // If the index is equal to size then we can call insertLast(val)
        if (position == size + 1) {
            insertLast(val);
            return;
        }

        // If index is in between 1st and size
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    /////////////////////// Delete Operations ////////////////////////////

    // Delete 1st element
    public int deleteFirst() {
        int val = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }


    // Delete 1st element
    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    // Delete At Position

    public int delete(int position) {

        if (position == 1) {
            return deleteFirst();
        }

        if (position == size) {
            return deleteLast();
        }

        Node previous = get(position - 2);

        int val = previous.next.value;

        previous.next = previous.next.next;

        return val;
    }

    // get Function
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Display function
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
