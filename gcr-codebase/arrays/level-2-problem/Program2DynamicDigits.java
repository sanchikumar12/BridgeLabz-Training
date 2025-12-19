import java.util.Scanner;

public class Program2DynamicDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        long num = sc.nextLong();

        int maxDigit = 10;                  // initial size
        int[] digits = new int[maxDigit];   // dynamic array
        int index = 0;

        // Extract digits with dynamic expansion
        while (num > 0) {
            int digit = (int) (num % 10);

            // ---- Hint (f) Modification ----
            if (index == maxDigit) {
                maxDigit += 10;                  // increase size by 10
                int[] temp = new int[maxDigit];  // new bigger array

                // copy old elements
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;                   // assign back to digits
            }
            // --------------------------------

            digits[index++] = digit;  // store digit
            num /= 10;
        }

        if (index < 2) {
            System.out.println("Not enough digits to find largest and second largest.");
            return;
        }

        // Find largest & second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
