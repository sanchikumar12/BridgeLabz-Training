package Day_07_Hackerrank;


import java.io.*;
import java.util.*;

class Result {

    public static int superDigit(String n, int k) {

        long sum = 0;

        for (char c : n.toCharArray()) {
            sum += c - '0';
        }

        sum = sum * k;

        while (sum >= 10) {
            long temp = 0;

            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }

            sum = temp;
        }

        return (int) sum;
    }
}

public class Question_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =
            new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int k = Integer.parseInt(st.nextToken());

        int result = Result.superDigit(n, k);

        System.out.println(result);

        br.close();
    }
}

