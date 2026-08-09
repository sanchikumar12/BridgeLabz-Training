package Day_03.Day_03_Classwork;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head = null;


    void insertAtFirst(int value) {
        Node n = new Node(value);
        n.next = head;
        head = n;
    }

  
    void insertAtLast(int value) {
        Node n = new Node(value);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
    }

 
    void insertAtPosition(int value, int pos) {

        if (pos <= 1) {
            insertAtFirst(value);
            return;
        }

        Node n = new Node(value);
        Node temp = head;
        int count = 1;

        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid");
       
        } else {
            n.next = temp.next;
            temp.next = n;
        }
    }


    void deleteAtFirst() {

 
        head = head.next;
    }

    void deleteAtLast() {

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

 
    void deleteAtPosition(int pos) {

       

        if (pos == 1) {
            deleteAtFirst();
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid");
            return;
        }

        temp.next = temp.next.next;
    }

  
    void reverse() {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;
    }


    public static void main(String[] args) {

        SinglyLinkedList obj = new SinglyLinkedList();

        obj.insertAtFirst(3);
        obj.insertAtFirst(1);
        obj.insertAtPosition(2, 2);
        obj.insertAtLast(4);
        obj.insertAtLast(5);

  
        obj.deleteAtFirst();
      
     obj.deleteAtLast();
        
     obj.deleteAtPosition(2);
       
        obj.reverse();
     
       
    }
}
