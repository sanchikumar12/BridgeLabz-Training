package Class11_hackerrank;

import java.util.Scanner;

public class TimeConversion {
    public static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String minSec = s.substring(2, 8);

        if (period.equals("AM")) {
            if (hour == 12) {
                return "00" + minSec;
            }
            return String.format("%02d", hour) + minSec;
        } else {
            if (hour != 12) {
                hour += 12;
            }
            return String.format("%02d", hour) + minSec;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(timeConversion(s));
        sc.close();
    }
}
