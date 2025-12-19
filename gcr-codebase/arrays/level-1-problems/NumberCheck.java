import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input section
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Check each number
        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last element
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.print("Comparison of first and last element: ");
        if (first == last) {
            System.out.println("Both are Equal");
        } else if (first > last) {
            System.out.println("First is Greater than Last");
        } else {
            System.out.println("First is Less than Last");
        }

        sc.close();
    }
}




}