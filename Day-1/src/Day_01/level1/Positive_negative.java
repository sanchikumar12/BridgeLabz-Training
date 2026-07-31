package Day_01.level1;

/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less*/


import java.util.Scanner;

public class Positive_negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.print(arr[i] + "  Positive");

                if (arr[i] % 2 == 0) {
                    System.out.println("  Even");
                } else {
                    System.out.println("  Odd");
                }

            } else if (arr[i] < 0) {
                System.out.println(arr[i] + "  Negative");
            } else {
                System.out.println(arr[i] + "  Zero");
            }
        }

        if (arr[0] == arr[4]) {
            System.out.println("First and Last  are Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

        sc.close();
    }
}