package Day_08_Hackerank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ThecoinchangeProblemResult {

    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */

    public static long getWays(int n, List<Long> c) {
    // Write your code here
          long[][] dp = new long[c.size()][n + 1];

    for (long[] row : dp) {
        Arrays.fill(row, -1);
    }

    return get(0, c, n, 0, dp);
    }
    


public static long get(int idx, List<Long> c, int target, int sum, long[][] dp) {

    if (sum == target) {
        return 1;
    }

    if (sum > target || idx >= c.size()) {
        return 0;
    }

    if (dp[idx][sum] != -1) {
        return dp[idx][sum];
    }

    long op1 = get(
        idx,
        c,
        target,
        sum + c.get(idx).intValue(),
        dp
    );

    long op2 = get(
        idx + 1,
        c,
        target,
        sum,
        dp
    );

    return dp[idx][sum] = op1 + op2;
}

}

public class ThecoinchangeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> c = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cTemp[i]);
            c.add(cItem);
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = ThecoinchangeProblemResult.getWays(n, c);

        bufferedWriter.write(String.valueOf(ways));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
