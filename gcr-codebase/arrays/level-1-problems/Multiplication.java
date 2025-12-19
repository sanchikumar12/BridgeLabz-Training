import java.util.*;

public class Multiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int table[] = new int[10];

        System.out.println("Enter a Number:");
        int number = sc.nextInt();

        int count = 1;
        int idx = 0;

        // Filling the table
        while (count <= 10) {
            table[idx] = number * count;
            count++;
            idx++;
        }

        // Printing the table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
