package Day_01.Hackerranck;

import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        int result = 0;

        for (int num : ar) {
            result += num;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().trim().split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            ar.add(Integer.parseInt(arTemp[i]));
        }

        int result = simpleArraySum(ar);

        System.out.println(result);

        bufferedReader.close();
    }
}