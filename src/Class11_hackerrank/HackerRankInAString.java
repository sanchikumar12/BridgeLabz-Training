package Class11_hackerrank;

import java.util.Scanner;

public class HackerRankInAString {
    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(idx)) {
                idx++;
                if (idx == target.length()) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s = sc.next();
            System.out.println(hackerrankInString(s));
        }
        sc.close();
    }
}
