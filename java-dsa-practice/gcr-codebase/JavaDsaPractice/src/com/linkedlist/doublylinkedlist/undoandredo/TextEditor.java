package com.linkedlist.doublylinkedlist.undoandredo;

public class TextEditor {
    private TextState head = null;
    private TextState tail = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    public void addState(String text) {
        TextState newState = new TextState(text);

        // If first state
        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = calculateSize();
        }

        //add at end
        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Maintain history limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo.");
            return;
        }

        current = current.prev;
        System.out.println("Undo performed.");
    }

    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo.");
            return;
        }

        current = current.next;
        System.out.println("Redo performed.");
    }

    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty.");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    private int calculateSize() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
