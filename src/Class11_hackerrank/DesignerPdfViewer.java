package Class11_hackerrank;

import java.util.Scanner;

public class DesignerPdfViewer {
    public static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            int charIndex = word.charAt(i) - 'a';
            if (h[charIndex] > maxHeight) {
                maxHeight = h[charIndex];
            }
        }
        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[26];
        for (int i = 0; i < 26; i++) {
            h[i] = sc.nextInt();
        }
        String word = sc.next();
        System.out.println(designerPdfViewer(h, word));
        sc.close();
    }
}
