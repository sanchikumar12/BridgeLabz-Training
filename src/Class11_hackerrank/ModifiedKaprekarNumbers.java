package Class11_hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    public static void kaprekarNumbers(int p, int q) {
        List<Integer> list = new ArrayList<>();

        for (long i = p; i <= q; i++) {
            long square = i * i;
            String sqStr = Long.toString(square);
            int d = Long.toString(i).length();

            String rStr = sqStr.substring(sqStr.length() - d);
            String lStr = sqStr.substring(0, sqStr.length() - d);

            long r = Long.parseLong(rStr);
            long l = lStr.isEmpty() ? 0 : Long.parseLong(lStr);

            if (l + r == i) {
                list.add((int) i);
            }
        }

        if (list.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        kaprekarNumbers(p, q);
        sc.close();
    }
}
