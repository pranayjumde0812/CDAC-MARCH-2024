package assignment_1;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public boolean insert(int data) {

        Node newNode = new Node(data);

        if (newNode == null) {
            return false;
        }

        if (head == null) {
            head = newNode;
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);

        return true;
    }


    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int findMaximumElement() {
        Node temp = head;
        int ans = 0;
        while (temp != null) {
            if (temp.getData() > ans) {
                ans = temp.getData();
            }
            temp = temp.getNext();
        }
        return ans;
    }

    public int findMinimumElement() {
        Node temp = head;
        int ans = Integer.MAX_VALUE;

        while (temp != null) {
            if (temp.getData() < ans) {
                ans = temp.getData();
            }
            temp = temp.getNext();
        }
        return ans;
    }

    public int sumOfEvenElement() {
        Node temp = head;
        int sum = 0;

        while (temp != null) {
            if (temp.getData() % 2 == 0) {
                sum += temp.getData();
            }
            temp = temp.getNext();
        }

        return sum;
    }
}
