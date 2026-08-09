package Day_02.Day_02_Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Question4Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
     Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {

        char ch = s.charAt(i);

        if (ch == '(' || ch == '{' || ch == '[') {

            stack.push(ch);

        } else {

            if (stack.isEmpty()) {
                return "NO";
            }

            char top = stack.pop();

            if (top == '(' && ch == ')') {

            } else if (top == '{' && ch == '}') {

            } else if (top == '[' && ch == ']') {

            } else {
                return "NO";
            }
        }
    }

    if (stack.isEmpty()) {
        return "YES";
    } else {
        return "NO";
    }
}


}

public class Question4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            String result = Question4Result.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

