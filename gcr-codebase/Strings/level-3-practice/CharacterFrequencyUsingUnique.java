import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method 1: Find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method 2: Find frequency using unique characters
    public static String[][] characterFrequency(String text) {

        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D String array
        String[][] result = new String[uniqueChars.length][2];

        // Store character and frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = characterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + " -> " + frequency[i][1]);
        }
    }
}
