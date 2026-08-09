package Day_03.Day_03_Classwork;

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

   
    void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }


    void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }


    void insertAtPosition(int data, int pos) {

        if (pos == 1) {
            insertAtFirst(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }


    void deleteAtFirst() {

        if (head == null)
            return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head)
            temp = temp.next;

        head = head.next;
        temp.next = head;
    }

    void deleteAtLast() {

        if (head == null)
            return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head)
            temp = temp.next;

        temp.next = head;
    }


 

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtPosition(10, 3);

        list.deleteAtFirst();
        list.deleteAtLast();
    
      
    }
}
