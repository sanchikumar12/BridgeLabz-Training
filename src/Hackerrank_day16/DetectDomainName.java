package Hackerrank_day16;

import java.util.*;
import java.util.regex.*;

public class DetectDomainName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        // Regex to capture domain name inside URLs, ignoring www. or ww2. prefix
        String regex = "https?://(?:www\\.|ww2\\.)?([a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+)";
        Pattern pattern = Pattern.compile(regex);

        Set<String> domains = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                domains.add(matcher.group(1));
            }
        }
        scanner.close();

        // Print unique domains in lexicographical order separated by semicolon
        System.out.println(String.join(";", domains));
    }
}
