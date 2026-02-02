package com.stream;

import java.util.*;

public class EmailNotifications {

    static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "alice@example.com",
            "bob@example.com",
            "charlie@example.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }
}
