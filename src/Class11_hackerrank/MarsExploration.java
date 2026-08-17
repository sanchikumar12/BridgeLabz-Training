package Class11_hackerrank;

import java.util.Scanner;

public class MarsExploration {
    public static int marsExploration(String s) {
        int changed = 0;
        String pattern = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                changed++;
            }
        }
        return changed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(marsExploration(s));
        sc.close();
    }
}
