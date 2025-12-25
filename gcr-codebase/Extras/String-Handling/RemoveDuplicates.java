// Creating RemoveDuplicates class to remove the duplicates
import java.util.*;
public class RemoveDuplicates {

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
