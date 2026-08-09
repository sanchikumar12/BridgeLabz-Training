package Day_02.Day_02_Classwork;

public class LinkedStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Deleted Element: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + top.data);
        }
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node t = top;

        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedStack s = new LinkedStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
}
