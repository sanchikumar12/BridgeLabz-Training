package Class11_hackerrank;

import java.util.Scanner;

public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        if (k >= s.length() + t.length()) {
            return "Yes";
        }

        int commonLength = 0;
        int minLen = Math.min(s.length(), t.length());
        while (commonLength < minLen && s.charAt(commonLength) == t.charAt(commonLength)) {
            commonLength++;
        }

        int minOps = (s.length() - commonLength) + (t.length() - commonLength);

        if (k >= minOps && (k - minOps) % 2 == 0) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int k = sc.nextInt();
        System.out.println(appendAndDelete(s, t, k));
        sc.close();
    }
}
