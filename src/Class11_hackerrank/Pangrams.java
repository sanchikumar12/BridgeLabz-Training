package Class11_hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
    public static String pangrams(String s) {
        s = s.toLowerCase();
        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        return letters.size() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pangrams(s));
        sc.close();
    }
}
