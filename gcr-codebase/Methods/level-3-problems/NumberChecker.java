import java.util.Scanner;

public class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int number) {
        if (number == 0) return 1;

        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits of number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check Duck Number
    // Duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largest[0]);
        System.out.println("Second Largest Digit: " + largest[1]);
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallest[0]);
        System.out.println("Second Smallest Digit: " + smallest[1]);
    }
}
