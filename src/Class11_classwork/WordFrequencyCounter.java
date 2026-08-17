package Class11_classwork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        if (text == null || text.trim().isEmpty()) {
            return frequencyMap;
        }

        String[] words = text.trim().toLowerCase().split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> result = countWordFrequency(text);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
