package Class11_hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {
    public static String superReducedString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        if (stack.isEmpty()) {
            return "Empty String";
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(superReducedString(s));
        sc.close();
    }
}
