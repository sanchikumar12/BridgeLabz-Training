package Hackerrank_day16;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Regular expression to validate username:
     * 1. The username consists of 8 to 30 characters inclusive.
     * 2. The username can contain alphanumeric characters and underscores (_).
     * 3. The first character must be an alphabetic character (a-z or A-Z).
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class ValidUsername {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
