package Class11_hackerrank;

import java.util.Scanner;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) hasDigit = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (specialChars.indexOf(ch) != -1) hasSpecial = true;
        }

        int missingTypes = 0;
        if (!hasDigit) missingTypes++;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasSpecial) missingTypes++;

        return Math.max(missingTypes, 6 - n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String password = sc.next();
        System.out.println(minimumNumber(n, password));
        sc.close();
    }
}
