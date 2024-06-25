import java.util.Stack;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
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

        if (head.getData() == data) {
            return false;
        }

        while (temp.getNext() != null) {
            temp = temp.getNext();
            if (temp.getData() == data) {
                return false;
            }
        }

        temp.setNext(newNode);
        return true;
    }

    public boolean insert(int data, int position) {
        if (position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }

        if (position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //locate prev node
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev == null) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;
    }

    public void displayReverse() {
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayReverse(Node temp) {
        if (temp == null) {
            System.out.println();
            return;
        }
        displayReverse(temp.getNext());
        System.out.print(temp.getData() + " ");
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
