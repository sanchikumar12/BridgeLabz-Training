package Day_03.Day_03_Hackerrank;
import java.util.*;
import java.io.*;

class InorderNode {
    InorderNode left;
    InorderNode right;
    int data;
    
    InorderNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Inorder {

/* you only have to complete the function given below.  
InorderNode is defined as  

class InorderNode {
    int data;
    InorderNode left;
    InorderNode right;
}

*/

    public static void inOrder(InorderNode root) {
        
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

	public static InorderNode insert(InorderNode root, int data) {
        if(root == null) {
            return new InorderNode(data);
        } else {
            InorderNode cur;
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
        InorderNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        inOrder(root);
    }	
}
