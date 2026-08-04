package Day_03;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;


    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtPosition(int data, int position) {
        if (position <= 1) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds. Inserting at end.");
            insertAtLast(data);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        }
    }

 
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = null;
        }
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

  
    

   
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(3);
        list.insertAtFirst(1);
        list.insertAtPosition(2, 2);
        list.insertAtLast(4);
        list.insertAtLast(5);
        
      
       
    }
}
