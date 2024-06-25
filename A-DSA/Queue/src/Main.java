public class Main {
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);

        System.out.println(cq.insert(10));
        System.out.println(cq.insert(20));
        System.out.println(cq.insert(30));
        System.out.println(cq.insert(40));
        System.out.println(cq.insert(50));
        System.out.println(cq.insert(50));

        System.out.println(cq.delete());
        System.out.println(cq.insert(60));
        System.out.println(cq.delete());
        System.out.println(cq.insert(60));


//        Queue q = new Queue(4);
//
//        q.insert(10);
//        System.out.println(q.delete());
//
//        System.out.println(q.insert(20));
//        System.out.println(q.insert(30));
//        System.out.println(q.insert(40));
//        System.out.println(q.insert(50));
//
//        System.out.println(q.delete());
//        System.out.println(q.delete());
//        System.out.println(q.delete());
//        System.out.println(q.delete());
//
//        System.out.println(q.isEmpty() + " " + q.isFull());
    }
}
