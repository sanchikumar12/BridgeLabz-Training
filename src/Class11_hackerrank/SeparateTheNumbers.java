package Class11_hackerrank;

import java.util.Scanner;

public class SeparateTheNumbers {
    public static void separateNumbers(String s) {
        if (s.length() <= 1) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i <= s.length() / 2; i++) {
            long firstNumber = Long.parseLong(s.substring(0, i));
            long current = firstNumber;
            StringBuilder sb = new StringBuilder();

            while (sb.length() < s.length()) {
                sb.append(current);
                current++;
            }

            if (sb.toString().equals(s)) {
                System.out.println("YES " + firstNumber);
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s = sc.next();
            separateNumbers(s);
        }
        sc.close();
    }
}
