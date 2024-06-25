public class Stack<T> {
    T [] arr;
    int size;
    int top;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = (T []) new Object[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (size - 1);
    }

    public boolean push(T data) {
        if(isFull()) {
            return false;
        }
        arr[++top] = data;
        return true;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }
        return arr[top--];
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }

        return arr[top];

        /*T val = pop();
        push(val);
        return val;*/
    }
}
