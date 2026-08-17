package Class11_hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int queriesCount = sc.nextInt();

        Set<Integer> weights = new HashSet<>();
        int currentWeight = 0;
        char prev = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int charVal = ch - 'a' + 1;
            if (ch == prev) {
                currentWeight += charVal;
            } else {
                currentWeight = charVal;
                prev = ch;
            }
            weights.add(currentWeight);
        }

        for (int i = 0; i < queriesCount; i++) {
            int q = sc.nextInt();
            if (weights.contains(q)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
