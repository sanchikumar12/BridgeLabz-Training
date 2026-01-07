package com.stackqueue;

import java.util.Stack;

public class SortStack {
    //main sorting function
    public static void sortStack(Stack<Integer> stack) {
    	
        if (stack.isEmpty()) {
            return;
        }
        //remove the top element
        int top = stack.pop();
        // Sort the remaining stack
        sortStack(stack);
        //insert the top element back in sorted order
        insertSorted(stack, top);
    }

    //helper function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int value) {
        // Base case: empty stack or value > top element
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        // remove top and recur
        int top = stack.pop();
        insertSorted(stack, value);
        //push the previous top back
        stack.push(top);
    }

    //print stack
    private static void displayStack(Stack<Integer> stack) {
        System.out.println(stack);
    }
    // main method 
    public static void main(String[] args) {
    	
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack:");
        displayStack(stack);
    }
}