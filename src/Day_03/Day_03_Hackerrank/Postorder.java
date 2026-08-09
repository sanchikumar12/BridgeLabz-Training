package Day_03.Day_03_Hackerrank;

import java.util.*;
import java.io.*;

class PostorderNode {
    PostorderNode left;
    PostorderNode right;
    int data;
    
    PostorderNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Postorder {

/* you only have to complete the function given below.  
PostorderNode is defined as  

class PostorderNode {
    int data;
    PostorderNode left;
    PostorderNode right;
}

*/

    public static void postOrder(PostorderNode root) {
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" "); 
        
        

    }

	public static PostorderNode insert(PostorderNode root, int data) {
        if(root == null) {
            return new PostorderNode(data);
        } else {
            PostorderNode cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        PostorderNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }	
}
