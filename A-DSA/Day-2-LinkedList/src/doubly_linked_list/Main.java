package doubly_linked_list;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("-------------------------------- Insert First ----------------------------------------");
        dll.insertFirst(10);
        dll.display();
        dll.insertFirst(11);
        dll.display();
        dll.insertFirst(12);
        dll.display();
        dll.insertFirst(13);
        dll.display();
        dll.insertFirst(14);
        dll.display();

        System.out.println("------------------------------- Insert Last -----------------------------------------");

        dll.insertLast(55);
        dll.display();
        dll.insertLast(56);
        dll.display();
        dll.insertLast(57);
        dll.display();
        dll.insertLast(58);
        dll.display();
        dll.insertLast(59);
        dll.display();

        System.out.println("------------------------------- Insert At Specific position -----------------------------------------");
        dll.insert(222, 8);
        dll.display();
        dll.insert(66, 0);
        dll.display();
        dll.insert(88, 5);
        dll.display();
        dll.insert(121, 7);
        dll.display();
        dll.insert(14, 14);
        dll.display();

        System.out.println("------------------------------- Delete First -----------------------------------------");
        dll.display();
        System.out.println("Element removed = " + dll.deleteFirst());
        dll.display();
        System.out.println("Element removed = " + dll.deleteFirst());
        dll.display();
        System.out.println("Element removed = " + dll.deleteFirst());
        dll.display();
        System.out.println("Element removed = " + dll.deleteFirst());
        dll.display();
        System.out.println("------------------------------- Delete Last -----------------------------------------");
        dll.display();
        System.out.println(dll.deleteLast());
        dll.display();

        System.out.println("------------------------------- Delete By index -----------------------------------------");
        dll.display();
        System.out.println(dll.delete(5));
        dll.display();

    }
}
