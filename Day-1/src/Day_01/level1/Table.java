package Day_01.level1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
        	//inserting for zero based indexing..
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}