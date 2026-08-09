package Day_03.Day_03_Hackerrank;
import java.util.*;
import java.io.*;

class PreorderNode {
    PreorderNode left;
    PreorderNode right;
    int data;
    
    PreorderNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class PreorderSolution {

/* you only have to complete the function given below.  
PreorderNode is defined as  

class PreorderNode {
    int data;
    PreorderNode left;
    PreorderNode right;
}

*/

    public static void preOrder(PreorderNode root) {
        
        if(root==null){
            return ;
        }
        
        System.out.print(root.data+" ");
        
        preOrder(root.left);
        preOrder(root.right);

    }

	public static PreorderNode insert(PreorderNode root, int data) {
        if(root == null) {
            return new PreorderNode(data);
        } else {
            PreorderNode cur;
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
        PreorderNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }	
}
