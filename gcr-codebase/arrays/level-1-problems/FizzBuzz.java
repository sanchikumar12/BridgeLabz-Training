import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // FizzBuzz starts from 1 to number
        String[] result = new String[number];

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else {
                result[i - 1] = Integer.toString(i);
            }
        }

        // Print results
        for (int i = 0; i < result.length; i++) {
            System.out.println("The result for position " + i + " is: " + result[i]);
        }

        sc.close();
    }
}
