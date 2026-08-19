package Day_12_Hackerrank;

class Parent {
    public static void show() {
        System.out.println("Parent class static show() executed.");
    }
}

class Child extends Parent {
    public static void show() {
        System.out.println("Child class static show() executed.");
    }
}

public class Q6 {
    public static void main(String[] args) {
        System.out.println("=== Static Method Hiding Demo ===");

        Parent ref = new Child();

        System.out.print("Calling ref.show() [Parent ref = new Child()]: ");
        ref.show();

        System.out.print("Calling Child.show(): ");
        Child.show();

        System.out.print("Calling Parent.show(): ");
        Parent.show();
    }
}
