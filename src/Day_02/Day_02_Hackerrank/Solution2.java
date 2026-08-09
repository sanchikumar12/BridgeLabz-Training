package Day_02.Day_02_Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution2Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    Stack<Integer> s3 = new Stack<>();

    for (int i = h1.size() - 1; i >= 0; i--) {
        s1.push(h1.get(i));
        sum1 += h1.get(i);
    }

    for (int i = h2.size() - 1; i >= 0; i--) {
        s2.push(h2.get(i));
        sum2 += h2.get(i);
    }

    for (int i = h3.size() - 1; i >= 0; i--) {
        s3.push(h3.get(i));
        sum3 += h3.get(i);
    }

    while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {

        if (sum1 == sum2 && sum2 == sum3) {
            return sum1;
        }

        if (sum1 >= sum2 && sum1 >= sum3) {
            sum1 = sum1 - s1.pop();
        } else if (sum2 >= sum1 && sum2 >= sum3) {
            sum2 = sum2 - s2.pop();
        } else {
            sum3 = sum3 - s3.pop();
        }
    }

    return 0;
    }
        
  

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        String[] h1Temp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h1 = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            int h1Item = Integer.parseInt(h1Temp[i]);
            h1.add(h1Item);
        }

        String[] h2Temp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h2 = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            int h2Item = Integer.parseInt(h2Temp[i]);
            h2.add(h2Item);
        }

        String[] h3Temp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h3 = new ArrayList<>();

        for (int i = 0; i < n3; i++) {
            int h3Item = Integer.parseInt(h3Temp[i]);
            h3.add(h3Item);
        }

        int result = Solution2Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
