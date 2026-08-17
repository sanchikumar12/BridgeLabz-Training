package Class11_hackerrank;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int day = i; day <= j; day++) {
            int diff = Math.abs(day - reverse(day));
            if (diff % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(beautifulDays(i, j, k));
        sc.close();
    }
}
