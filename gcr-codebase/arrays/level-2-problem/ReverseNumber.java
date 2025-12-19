import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Make a copy to extract digits
        int temp = num;

        // Step 2: Count digits
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Create a reversed array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Step 5: Display reversed number
        System.out.print("Reversed number: ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
    }
}
