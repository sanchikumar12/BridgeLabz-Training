package Day_02.Day_02_Classwork;

public class ArrayQueue {

    int queue[] = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int data) {

        if (rear == queue.length-1) {
            System.out.println("Queue is Full");
        } else {
            rear++;
            queue[rear] = data;
        }
    }

    void dequeue() {

        if (front > rear) {
            System.out.println("Empty");
        } else {
            System.out.println("Deleted" + queue[front]);
            front++;
        }
    }

   

    public static void main(String[] args) {

        ArrayQueue obj = new ArrayQueue();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.dequeue();

       
    }
}
