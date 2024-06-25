package singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("++++++++++++++++++++++++++++++++++ Insert First +++++++++++++++++++++++++++++++++++++++++++++++");
//        list.display();
        list.insertFirst(10);
        list.insertFirst(90);
        list.insertFirst(8);
        list.insertFirst(73);
        list.insertFirst(62);
        list.insertFirst(13);

        list.display();
        System.out.println("++++++++++++++++++++++++++++++++++ Insert Last +++++++++++++++++++++++++++++++++++++++++++++++");
        list.display();
        list.insertLast(88);
        list.insertLast(41);
        list.insertLast(12);
        list.insertLast(26);
        list.insertLast(45);

        list.display();
        System.out.println("++++++++++++++++++++++++++++++++++ Insert at Position +++++++++++++++++++++++++++++++++++++++++++++++");
        list.display();
        list.insert(555, 4);
        list.display();
        list.insert(999, 3);
        list.display();
        list.insert(500, 2);
        list.display();
        list.insert(610, 5);
        list.display();
        list.insert(1516, 16);
        list.display();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++ Delete First ++++++++++++++++++++++++++++++++++++++++++++++++");
        list.display();
        System.out.println("First element removed = " + list.deleteFirst());
        list.display();
        System.out.println("First element removed = " + list.deleteFirst());
        list.display();
        System.out.println("First element removed = " + list.deleteFirst());
        list.display();
        System.out.println("First element removed = " + list.deleteFirst());
        list.display();
        System.out.println("First element removed = " + list.deleteFirst());
        list.display();

        System.out.println("+++++++++++++++++++++++++++++++++++ Delete Last ++++++++++++++++++++++++++++++++++++++++++++++");
        list.display();
        System.out.println("Last element removed = " + list.deleteLast());
        list.display();
        System.out.println("Last element removed = " + list.deleteLast());
        list.display();
        System.out.println("Last element removed = " + list.deleteLast());
        list.display();
        System.out.println("++++++++++++++++++++++++++++++++++ Delete At Position +++++++++++++++++++++++++++++++++++++++++++++++");
        list.display();
        System.out.println("element removed = " + list.delete(2));
        list.display();
        System.out.println("element removed = " + list.delete(1));
        list.display();
        System.out.println("element removed = " + list.delete(5));
        list.display();
        System.out.println("element removed = " + list.delete(4));
        list.display();
    }
}