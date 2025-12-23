import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return 2D array
    public static char[][] findCharacterFrequency(String text) {

        int[] freq = new int[256]; // ASCII frequency array

        // Step 1: Count frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -1; // mark counted
            }
        }

        // Reset frequency array
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 3: Create 2D array
        char[][] result = new char[uniqueCount][2];
        int index = 0;

        // Step 4: Store character and frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = ch;              // character
                result[index][1] = (char) freq[ch]; // frequency
                index++;
                freq[ch] = 0; // avoid duplicate entry
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[][] frequency = findCharacterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + " -> " + (int)frequency[i][1]);
        }
    }
}
