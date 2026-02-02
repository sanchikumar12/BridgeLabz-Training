package com.stream;

import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Alice",
            "Bob",
            "Charlie",
            "Diana"
        );

        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
