package Class11_hackerrank;

import java.util.Scanner;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        k = k % 26;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                char shifted = (char) ('a' + (ch - 'a' + k) % 26);
                sb.append(shifted);
            } else if (Character.isUpperCase(ch)) {
                char shifted = (char) ('A' + (ch - 'A' + k) % 26);
                sb.append(shifted);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(caesarCipher(s, k));
        sc.close();
    }
}
