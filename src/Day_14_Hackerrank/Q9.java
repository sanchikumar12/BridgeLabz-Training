package Day_14_Hackerrank;

public class Q9 {

    static class Shape {
        public void draw() {
            System.out.println("Drawing a generic shape.");
        }
    }

    static class Shape2D extends Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a 2D Shape (Overridden draw()).");
        }

        public void draw(String color) {
            System.out.println("Drawing a 2D Shape with color: " + color + " (Overloaded draw(String)).");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Method Overriding vs Method Overloading ===");
        Shape2D shape = new Shape2D();

        shape.draw();

        shape.draw("Neon Cyan");
    }
}
