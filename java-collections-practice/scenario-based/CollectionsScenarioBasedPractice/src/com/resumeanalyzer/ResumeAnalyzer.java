package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    private static final String EMAIL_REGEX = " [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    private static final String PHONE_REGEX = "\\b\\d{10}\\b ";

    private static final String[] KEYWORDS = {"Java", "Python", "Spring"};

    public static void main(String[] args) {

        File folder = new File("resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> resumeList = new ArrayList<>();

        for (File file : folder.listFiles()) {
            try {
                if (!file.getName().endsWith(".txt")) {
                    throw new InvalidResumeFormatException("Unsupported file: " + file.getName());
                }

                String content = readFile(file);
                String email = extractPattern(content, EMAIL_REGEX);
                String phone = extractPattern(content, PHONE_REGEX);
                List<String> matchedKeywords = extractKeywords(content);

                ResumeData data = new ResumeData(email, phone, matchedKeywords);
                resumeMap.put(email, data);
                resumeList.add(data);

            } catch (Exception e) {
                System.out.println("skipping  resume: " + e.getMessage());
            }
        }

        resumeList.sort((a, b) -> b.getMatchCount() - a.getMatchCount());

        resumeList.forEach(System.out::println );
    }

    private static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    private static String extractPattern(String text, String regex) throws Exception {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Required data not found");
    }

    private static List<String> extractKeywords(String text) {
        List<String> matched = new ArrayList<>();
        for (String keyword : KEYWORDS) {
        	
            if (Pattern.compile(keyword, Pattern.CASE_INSENSITIVE).matcher(text).find()) {
                matched.add(keyword);
            }
        }
        return matched;
    }
}
