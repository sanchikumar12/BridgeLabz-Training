package com.oopspracticescenariobasedquestions.eventease;

public class EventEaseApp {
 public static void main(String[] args) {

     User user = new User("Alice Johnson", "alice@example.com");

     // Creating event with packages
     Event wedding = new Event("Wedding Ceremony", "Grand Hall", "2026-02-15",
             200, user, 12000, 8000, 3000);

     wedding.schedule();
     System.out.println("Total Cost: ₹" + wedding.calculateTotalCost());

     // Creating a Birthday Event
     BirthdayEvent birthday = new BirthdayEvent("Tom's Birthday", "City Club",
             "2026-03-10", 50, user, "Marvel Superheroes");

     birthday.schedule();

     // Creating a Conference Event
     ConferenceEvent conference = new ConferenceEvent("Tech Summit", "Expo Center",
             "2026-04-12", 500, user, "Dr. Ravi Sharma");

     conference.schedule();
 }
}

