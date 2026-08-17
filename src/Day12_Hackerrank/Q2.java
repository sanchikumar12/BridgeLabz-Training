package Day12_Hackerrank;

class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void scale(int factor) {
        length *= factor;
        width *= factor;
    }
}

public class Q2 {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 5);

        Rectangle rect2 = rect1;

        rect2.scale(2);

        System.out.println("rect1 length: " + rect1.length);
        System.out.println("rect1 width: " + rect1.width);
    }
}