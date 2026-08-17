package Class11_hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadybugs {
    public static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        boolean hasEmpty = false;

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch == '_') {
                hasEmpty = true;
            } else {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (int count : map.values()) {
            if (count == 1) return "NO";
        }

        if (!hasEmpty) {
            for (int i = 0; i < b.length(); i++) {
                boolean left = i > 0 && b.charAt(i) == b.charAt(i - 1);
                boolean right = i < b.length() - 1 && b.charAt(i) == b.charAt(i + 1);
                if (!left && !right) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        while (g-- > 0) {
            int n = sc.nextInt();
            String b = sc.next();
            System.out.println(happyLadybugs(b));
        }
        sc.close();
    }
}
