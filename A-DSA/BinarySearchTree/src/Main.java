public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(20);
        bst.insert(10);
        bst.insert(40);
        bst.insert(90);
        bst.insert(80);
        bst.insert(60);
        bst.insert(70);
        bst.insert(100);
        bst.insert(90);
        bst.insert(30);

        bst.preOrder();
        bst.preOrder(bst.getRoot());
        System.out.println();

        bst.inOrder();
        bst.inOrder(bst.getRoot());
        System.out.println();

        bst.postOrder();
        bst.postOrder(bst.getRoot());
        System.out.println();

        System.out.println("Count = " + bst.getCount(bst.getRoot()));
        System.out.println("Max = " + bst.getMax());

        bst.delete(50);

        System.out.println();
        bst.preOrder();
        bst.preOrder(bst.getRoot());
        System.out.println();

        bst.inOrder();
        bst.inOrder(bst.getRoot());
        System.out.println();

        bst.postOrder();
        bst.postOrder(bst.getRoot());
        System.out.println();

        bst.delete(80);

        System.out.println();
        bst.preOrder();
        bst.preOrder(bst.getRoot());
        System.out.println();

        bst.inOrder();
        bst.inOrder(bst.getRoot());
        System.out.println();

        bst.postOrder();
        bst.postOrder(bst.getRoot());
        System.out.println();

        System.out.println( bst.delete(80) );

    }
}
