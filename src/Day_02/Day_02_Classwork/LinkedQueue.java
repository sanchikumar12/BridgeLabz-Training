package Day_02.Day_02_Classwork;

public class LinkedQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data) {

        Node n = new Node(data);

        if (front == null) {
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
    }

    void dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted " + front.data);
            front = front.next;
        }
    }


    public static void main(String[] args) {

        LinkedQueue obj = new LinkedQueue();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);

     

        obj.dequeue();

 
    }
}
