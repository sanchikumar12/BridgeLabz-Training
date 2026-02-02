package com.Collectors;
import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String paragraph = "Java streams make Java code clean and streams make code readable";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                  .collect(Collectors.toMap(
                      word -> word,          // key
                      word -> 1,             // initial value
                      Integer::sum           // merge function
                  ));

        wordCount.forEach((word, count) ->
            System.out.println(word + " -> " + count)
        );
    }
}

