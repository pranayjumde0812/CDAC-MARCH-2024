package singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(90);
        list.insertFirst(8);
        list.insertFirst(73);
        list.insertFirst(62);
        list.insertFirst(13);

        list.display();

        list.insertLast(88);
        list.insertLast(41);
        list.insertLast(12);
        list.insertLast(26);
        list.insertLast(45);

        list.display();

        list.insert(555, 4);
        list.display();

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
//        System.out.println(list.deleteLast());
//        list.display();

    }
}