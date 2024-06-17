package assignment_2;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }


    public boolean insert(Product product) {
        Node node = new Node(product);

        if (node == null) {
            return false;
        }

        if (head == null) {
            head = node;
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(node);
        return true;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.getProduct() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
