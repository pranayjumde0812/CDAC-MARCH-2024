package Stack_Using_ArrayList;

import java.util.ArrayList;

public class DynamicStack {
    ArrayList<Integer> stack = new ArrayList<>();

    public boolean isEmpty() {

        return stack.size() == 0;
    }

    public boolean push(int data) {
        if (stack.add(data)) {
            return true;
        }
        return false;
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return stack.remove(stack.size() - 1);
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }

        return stack.get(stack.size() - 1);
    }

    public void display() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}
