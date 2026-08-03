package Day_02.implementation;

public class ArrayStack {

    int arr[];
    int top = -1;

    ArrayStack(int size) {
        arr = new int[size];
    }

    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
            return;
        }

        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Deleted Element: " + arr[top]);
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ArrayStack obj = new ArrayStack(5);

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        System.out.println("Stack Elements:");
        obj.display();

        obj.peek();

        obj.pop();

        System.out.println("After Pop:");
        obj.display();
    }
}