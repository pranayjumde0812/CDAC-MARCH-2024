public class Main {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>(5);

        s.push("Pune");
        s.push("Mumbai");

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
