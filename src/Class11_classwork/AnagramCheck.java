package Class11_classwork;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();
        
        if (s1.length() != s2.length()) return false;
        
        int[] counts = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i)]++;
            counts[s2.charAt(i)]--;
        }
        
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(isAnagram(s1, s2));
        scanner.close();
    }
}
