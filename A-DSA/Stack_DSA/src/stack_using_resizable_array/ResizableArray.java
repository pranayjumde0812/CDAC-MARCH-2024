package stack_using_resizable_array;

public class ResizableArray<T> {
    T[] arr;
    int size;
    int top;

    public ResizableArray(int size) {
        this.size = size;
        this.top = -1;
        arr = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (size - 1);
    }

    public boolean push(T data) {
        if (isFull()) {
            resizeCurrentArray(size * 2);
        }

        arr[++top] = data;
        return true;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return arr[top--];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return arr[top];
    }

    public void displayStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // method for resizing the current array and work as a
    // dynamic stack.

    public void resizeCurrentArray(int newSize) {
        T[] newArr = (T[]) new Object[newSize];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        size = newSize;
    }
}
