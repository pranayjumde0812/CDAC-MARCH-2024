package assignment_2;

public class Node {

    private Product product;
    private Node next;

    public Node() {

    }

    public Node(Product product) {
        this.product = product;
        this.next = null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
