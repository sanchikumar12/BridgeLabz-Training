import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find frequency using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();   // store characters
        int[] freq = new int[chars.length];  // store frequency

        // Step 1: Calculate frequency using nested loops
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Step 2: Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Step 3: Create 1D String array for result
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findCharacterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (String s : frequency) {
            System.out.println(s);
        }
    }
}
