public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }

        if (head == null) {

            head = newNode;
            head.setNext(head);
            return true;
        }

        Node last = head;
        while (last.getNext() != head) {
            last = last.getNext();
        }

        last.setNext(newNode);
        newNode.setNext(head);
        return true;
    }

    public boolean insert(int data, int position) {
        if ((head == null && position > 1) || position <= 0) {
            return false;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            if (head == null) {
                head = newNode;
                head.setNext(head);
                return true;
            }

            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }

            newNode.setNext(head);
            head = newNode;
            last.setNext(newNode);
            return true;
        }

        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev == head) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        return true;
    }

    public boolean deleteByVal(int data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            if (head.getNext() == head) {
                head = null;
                return true;
            }

            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }
            head = head.getNext();
            last.setNext(head);

            return true;
        }

        Node prev = head, del = head;
        while (del.getData() != data) {
            prev = del;
            del = del.getNext();
            if (del == head) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        return true;
    }

    public boolean deleteByPosition(int position) {
        if (head == null || position <= 0) {
            return false;
        }

        if (position == 1) {
            if (head.getNext() == head) {
                head = null;
                return true;
            }
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }

            head = head.getNext();
            last.setNext(head);

            return true;
        }

        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            //check if prev referring to last node
            if (prev.getNext() == head) {
                return false;
            }
        }

        Node del = prev.getNext();
        prev.setNext(del.getNext());

        return true;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while (temp != head);

        System.out.println();
    }
}
