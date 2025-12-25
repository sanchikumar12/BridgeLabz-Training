import java.util.*;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println(longest);
    }
}
