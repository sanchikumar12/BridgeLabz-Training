package Day_02.implementation;

public class LinkedStack {
    private Node top;

    public LinkedStack() {
        this.top = null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Linked Stack is empty!");
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Linked Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked Stack is empty!");
            return;
        }
        System.out.print("Linked Stack: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
