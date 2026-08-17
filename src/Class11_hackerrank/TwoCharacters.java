package Class11_hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {
    public static int alternate(String s) {
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            unique.add(s.charAt(i));
        }

        Character[] chars = unique.toArray(new Character[0]);
        int maxLen = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                char c1 = chars[i];
                char c2 = chars[j];

                StringBuilder filtered = new StringBuilder();
                for (int k = 0; k < s.length(); k++) {
                    char ch = s.charAt(k);
                    if (ch == c1 || ch == c2) {
                        filtered.append(ch);
                    }
                }

                boolean valid = true;
                for (int k = 0; k < filtered.length() - 1; k++) {
                    if (filtered.charAt(k) == filtered.charAt(k + 1)) {
                        valid = false;
                        break;
                    }
                }

                if (valid && filtered.length() > maxLen) {
                    maxLen = filtered.length();
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s = sc.next();
        System.out.println(alternate(s));
        sc.close();
    }
}
