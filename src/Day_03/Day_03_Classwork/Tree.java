package Day_03.Day_03_Classwork;

import java.util.Stack;

public class Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    Node root;

  
    void preorder() {

        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    
    void inorder() {
    	
    	if(root==null) 
    	{
    		return;
    	}
    	
    	Stack<Node> stack =new Stack<>();
    	
    	
    	Node cur =root;
    	while(stack.isEmpty()==false &&  cur!=null) {
    		
    		
    		  while(cur!=null) {
    			  stack.push(cur);
    			  cur=cur.left;
    			  
    		  }
    		  
    		  
    		  Node temp=stack.pop();
    		  System.out.println(cur);
    		  
    		  cur=temp.right;
    		
    	}
    	
    	
    	
    	
    }
    
    void postorder() {
    	
    	  if (root == null)
              return;

          Stack<Node> stack1 = new Stack<>();
          Stack<Node> stack2 = new Stack<>();

          stack1.push(root);

          while (!stack1.isEmpty()) {

              Node curr = stack1.pop();
              stack2.push(curr);

          
              if (curr.left != null)
                  stack1.push(curr.left);

        
              if (curr.right != null)
                  stack1.push(curr.right);
          }

          while (!stack2.isEmpty()) {
              System.out.print(stack2.pop().data);
          }
    	
    }

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node(3);

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);

        tree.root.left = one;
        tree.root.right = two;
        two.left = three;

        System.out.println("Preorder Traversal:");
        tree.preorder();
        tree.postorder();
        tree.inorder();
    }
}
