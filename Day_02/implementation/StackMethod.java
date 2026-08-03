package Day_02.implementation;

public class StackMethod {
    public static void runStackDemo() {
      
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.display();
        System.out.println(" reemoved " + arrayStack.pop());
        arrayStack.display();
        System.out.println();

   
    }
}
