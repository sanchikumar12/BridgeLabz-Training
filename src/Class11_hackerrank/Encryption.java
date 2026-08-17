package Class11_hackerrank;

import java.util.Scanner;

public class Encryption {
    public static String encryption(String s) {
        s = s.replaceAll("\\s+", "");
        int len = s.length();
        int row = (int) Math.floor(Math.sqrt(len));
        int col = (int) Math.ceil(Math.sqrt(len));

        if (row * col < len) {
            row++;
        }

        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < col; c++) {
            for (int r = 0; r < row; r++) {
                int index = r * col + c;
                if (index < len) {
                    sb.append(s.charAt(index));
                }
            }
            if (c < col - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(encryption(s));
        sc.close();
    }
}
