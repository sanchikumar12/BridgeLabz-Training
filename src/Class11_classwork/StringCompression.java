package Class11_classwork;

import java.util.Scanner;

public class StringCompression {
    public static String compress(String s) {
        if (s == null || s.isEmpty()) return s;

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }

        String compressed = sb.toString();
        return compressed.length() < s.length() ? compressed : s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(compress(input));
        scanner.close();
    }
}
