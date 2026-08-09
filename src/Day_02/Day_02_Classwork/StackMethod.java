package Day_02.Day_02_Classwork;
import java.util.*;
public class StackMethod {
    public static void runStackDemo() {
      
        ArrayStack arrayStack = new ArrayStack(3);

        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);

        arrayStack.display();

        arrayStack.peek();

        arrayStack.pop();

        
        System.out.println();

   
    }
}
