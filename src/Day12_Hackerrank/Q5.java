package Day12_Hackerrank;

class Pizza {

    String size;
    String crustType;
    int toppingsCount;
    double price;

    Pizza(String size) {
        this(size, "Regular", 0);
    }

    Pizza(String size, String crustType) {
        this(size, crustType, 0);
    }

    Pizza(String size, String crustType, int toppingsCount) {
        this(size, crustType, toppingsCount, 0);
    }

    Pizza(String size, String crustType, int toppingsCount, double price) {
        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;

        if (price == 0) {
            if (size.equals("Small"))
                this.price = 200;
            else if (size.equals("Medium"))
                this.price = 300;
            else
                this.price = 400;

            this.price += toppingsCount * 50;
        } else {
            this.price = price;
        }
    }

    void display() {
        System.out.println(size + " " + crustType + " " + toppingsCount + " " + price);
    }
}

public class Q5 {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("Small");
        Pizza p2 = new Pizza("Medium", "Thin");
        Pizza p3 = new Pizza("Large", "Regular", 2);
        Pizza p4 = new Pizza("Large", "Cheese Burst", 3, 1000);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}