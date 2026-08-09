package Day_02.Day_02_Hackerrank;

import java.io.*;
import java.util.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (q-- > 0) {

            String[] a = sc.nextLine().split(" ");

            if (a[0].equals("1")) {

                s1.push(Integer.parseInt(a[1]));

            } else if (a[0].equals("2")) {

                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                s2.pop();

            } else {

                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                System.out.println(s2.peek());
            }
        }
    }
}
