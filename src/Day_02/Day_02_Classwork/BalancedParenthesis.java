package Day_02.Day_02_Classwork;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String s) {

        if (s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if ((top == '(' && ch == ')') ||
                    (top == '[' && ch == ']') ||
                    (top == '{' && ch == '}')) {

                    stack.pop();

                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("()[]{}"));
    
    }
}
