package assignment_2;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, 3, 5);
        LinkedList list = new LinkedList();
        list.insert(product1);
        list.display();
    }
}
