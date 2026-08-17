package Class11_hackerrank;

import java.util.Scanner;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long countPerString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countPerString++;
            }
        }

        long fullRepeats = n / s.length();
        long remainder = n % s.length();
        long total = fullRepeats * countPerString;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        System.out.println(repeatedString(s, n));
        sc.close();
    }
}
