package Day_02.Day_02_Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Question1Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
      Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    List<Integer> list = new ArrayList<>();

    for (String op : operations) {

        String[] a = op.split("\\s+");

        if (a[0].equals("1")) {

            int val = Integer.parseInt(a[1]);

            stack.push(val);

            if (maxStack.isEmpty() || val >= maxStack.peek()) {
                maxStack.push(val);
            }

        } else if (a[0].equals("2")) {

            if (!stack.isEmpty()) {

                int x = stack.pop();

                if (x == maxStack.peek()) {
                    maxStack.pop();
                }
            }

        } else if (a[0].equals("3")) {

            list.add(maxStack.peek());
        }
    }

    return list;
    
    }

}

public class Question1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String opsItem = bufferedReader.readLine();
            ops.add(opsItem);
        }

        List<Integer> res = Question1Result.getMax(ops);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
