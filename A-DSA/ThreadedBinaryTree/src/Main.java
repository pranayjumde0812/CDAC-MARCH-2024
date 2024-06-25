public class Main {
    public static void main(String[] args) {

        ThreadedBST t1 = new ThreadedBST();

        t1.insert(50);
        t1.insert(20);
        t1.insert(10);
        t1.insert(40);
        t1.insert(30);
        t1.insert(90);
        t1.insert(80);
        t1.insert(60);
        t1.insert(65);
        t1.insert(100);

        t1.inOrder();
        t1.preOrder();
        t1.postOrder();

        t1.delete(50);
        t1.inOrder();
        t1.preOrder();
        t1.postOrder();
        System.out.println(t1.delete(50));



    }
}
