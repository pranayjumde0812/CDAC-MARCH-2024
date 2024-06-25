package assignment_1;

public class SinglyLinkedList {

    Node head;

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

    // Q2. Find middle element in LL in single pass
    public int findMiddleElement() {
        Node slow = head;
        Node fast = head;

        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow.getData();
    }

    // Q3. Reverse LL without recursion
    public void reverse() {
//        Node temp = head;
        if (head == null) {
            return;
        }
        Node n1 = head;
        Node n2 = head.getNext();
        while (n2 != null) {
            Node n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }
        Node temp = head;
        temp.setNext(null);
        temp = n1;

        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Q7. Reverse a LL
    public void reverse(Node headNode) {
        if (headNode == null) {
//            System.out.println();
            return;
        }
        reverse(headNode.getNext());
        System.out.print(headNode.getData() + " ");
    }
}
