package Hackerrank_day16;

import java.util.Scanner;

class MyRegex {
    /*
     * IP address regex:
     * 0 to 255:
     * 0-9, 00-99, 000-199 -> [01]?\d{1,2}
     * 200-249             -> 2[0-4]\d
     * 250-255             -> 25[0-5]
     */
    private static final String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
