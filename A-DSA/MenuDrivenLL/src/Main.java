import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("1. Display LL\n2. Insert First\n3. Insert Last" +
                        "\n4. Insert At position\n5. Delete First\n6. Delete Last" +
                        "\n7. Delete By Position\n8. Exit");
                choice = scanner.nextInt();

                try {


                    switch (choice) {
                        case 1:
                            list.display();
                            break;
                        case 2:
                            System.out.println("Enter the value");
                            list.insertFirst(scanner.nextInt());
                            break;
                        case 3:
                            System.out.println("Enter the value");
                            list.insertLast(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println("Enter the value & The Position");
                            list.insert(scanner.nextInt(), scanner.nextInt());
                            break;
                        case 5:
                            System.out.println("Value removed = " + list.deleteFirst());
                            break;
                        case 6:
                            System.out.println("Value removed = " + list.deleteLast());
                            break;
                        case 7:
                            System.out.println("Enter the Position : ");
                            System.out.println("Value removed = " + list.delete(scanner.nextInt()));
                            break;
                        case 8:
                            System.out.println("Exiting.....");
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    scanner.nextLine();
                }

            } while (choice != 0);

        }

    }
}