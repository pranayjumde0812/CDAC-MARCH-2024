package assignment_1;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(8);
        list.insert(1);
        list.insert(2);
        list.insert(5);
        list.insert(7);
        list.insert(4);
        list.insert(19);
        list.display();

        System.out.println("Maximum element of SLL = " + list.findMaximumElement());
        System.out.println("Minimum element of SLL = " + list.findMinimumElement());
        System.out.println("Sum of even element of SLL = " + list.sumOfEvenElement());
        System.out.println("Middle element of SLL = " + list.findMiddleElement());
        list.display();
        list.reverse();
        list.display();
//        list.reverse(list.head);
    }
}
