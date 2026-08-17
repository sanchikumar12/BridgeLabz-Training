package Class11_hackerrank;

import java.util.Scanner;

public class TheTimeInWords {
    static String[] words = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen",
        "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
        "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"
    };

    public static String timeInWords(int h, int m) {
        if (m == 0) {
            return words[h] + " o' clock";
        } else if (m == 1) {
            return words[m] + " minute past " + words[h];
        } else if (m == 15 || m == 30) {
            return words[m] + " past " + words[h];
        } else if (m <= 30) {
            return words[m] + " minutes past " + words[h];
        } else if (m == 45) {
            return words[60 - m] + " to " + words[h % 12 + 1];
        } else if (m == 59) {
            return words[60 - m] + " minute to " + words[h % 12 + 1];
        } else {
            return words[60 - m] + " minutes to " + words[h % 12 + 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(timeInWords(h, m));
        sc.close();
    }
}
