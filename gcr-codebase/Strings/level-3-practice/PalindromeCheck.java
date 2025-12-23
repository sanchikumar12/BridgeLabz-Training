import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Reverse string using charAt()
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reverse = new char[length];

        for (int i = 0; i < length; i++) {
            reverse[i] = text.charAt(length - 1 - i);
        }
        return reverse;
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nPalindrome Check Results:");

        System.out.println("Logic 1 (Iterative): " +
                (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 2 (Recursive): " +
                (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 3 (Array): " +
                (isPalindromeUsingArray(text) ? "Palindrome" : "Not Palindrome"));
    }
}
