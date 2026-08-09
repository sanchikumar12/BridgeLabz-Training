package Day_06.Day_06_Hackerrank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Question_2Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        int[] a = new int[arr.size()];
        int[] b = new int[brr.size()];

        // Convert List -> array
        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }

        for (int j = 0; j < brr.size(); j++) {
            b[j] = brr.get(j);
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (j < b.length) {

            int value = b[j];

            // Move i until a[i] >= value
            while (i < a.length && a[i] < value) {
                i++;
            }

            // value does not exist in a
            if (i == a.length || a[i] > value) {

                list.add(value);

                // Skip duplicate occurrences in b
                while (j < b.length && b[j] == value) {
                    j++;
                }

                continue;
            }

            // Count occurrences in a
            int countA = 0;

            while (i < a.length && a[i] == value) {
                countA++;
                i++;
            }

            // Count occurrences in b
            int countB = 0;

            while (j < b.length && b[j] == value) {
                countB++;
                j++;
            }

            // If frequencies are different,
            // this number is missing from arr
            if (countA != countB) {
                list.add(value);
            }
        }

        return list;
    }
}

public class Question_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH"))
            );

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr =
            Stream.of(
                bufferedReader.readLine()
                    .replaceAll("\\s+$", "")
                    .split(" ")
            )
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr =
            Stream.of(
                bufferedReader.readLine()
                    .replaceAll("\\s+$", "")
                    .split(" ")
            )
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result =
            Question_2Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
