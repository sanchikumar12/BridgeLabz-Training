import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert to positive if user enters negative number
        number = Math.abs(number);

        // Step 2: Count digits and store them in an array
        String numStr = Long.toString(number);
        int n = numStr.length();

        int[] digits = new int[n];  // array to store each digit

        for (int i = 0; i < n; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }

        // Step 3: Frequency array of size 10
        int[] freq = new int[10];

        // Step 4: Count frequency
        for (int d : digits) {
            freq[d]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " = " + freq[i]);
        }
    }
}
