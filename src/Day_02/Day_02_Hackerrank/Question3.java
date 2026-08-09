package Day_02.Day_02_Hackerrank;
import java.io.*;
import java.util.*;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        StringBuilder text = new StringBuilder();
        Stack<String> undo = new Stack<>();

        for (int i = 0; i < n; i++) {

            String[] a = sc.nextLine().split(" ");
            int op = Integer.parseInt(a[0]);

            if (op == 1) {

                text.append(a[1]);
                undo.push("2 " + a[1].length());

            } else if (op == 2) {

                int k = Integer.parseInt(a[1]);
                String rem = text.substring(text.length() - k);

                undo.push("1 " + rem);
                text.delete(text.length() - k, text.length());

            } else if (op == 3) {

                int k = Integer.parseInt(a[1]);
                System.out.println(text.charAt(k - 1));

            } else if (op == 4) {

                String[] b = undo.pop().split(" ");

                if (b[0].equals("1")) {

                    text.append(b[1]);

                } else {

                    int k = Integer.parseInt(b[1]);
                    text.delete(text.length() - k, text.length());
                }
            }
        }

        sc.close();
    }
}
