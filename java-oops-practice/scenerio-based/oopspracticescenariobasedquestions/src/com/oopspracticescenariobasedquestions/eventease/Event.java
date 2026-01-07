package com.oopspracticescenariobasedquestions.eventease;

class Event implements ISchedulable {
	 private static int counter = 1000;

	 private final int eventId; // once assigned, cannot be modified
	 private String eventName;
	 protected String location;
	 protected String date;
	 protected int attendees;

	 // Encapsulated pricing information
	 private double venueCost;
	 private double serviceCost;
	 private double discount;

	 protected User organizer;

	 // Constructor WITHOUT packages
	 public Event(String name, String location, String date, int attendees, User organizer) {
	     this.eventId = counter++;  // auto-generated, non-editable
	     this.eventName = name;
	     this.location = location;
	     this.date = date;
	     this.attendees = attendees;
	     this.organizer = organizer;
	     this.venueCost = 5000;
	     this.serviceCost = 0;
	     this.discount = 0;
	 }

	 // Constructor WITH catering/decoration packages
	 public Event(String name, String location, String date, int attendees,
	              User organizer, double cateringCost, double decorCost, double discount) {
	     this(name, location, date, attendees, organizer);
	     this.serviceCost = cateringCost + decorCost;
	     this.discount = discount;
	 }

	 public int getEventId() { return eventId; }

	 // Cost calculation using operators
	 public double calculateTotalCost() {
	     return venueCost + serviceCost - discount;
	 }

	 // Implemented interface methods (default behavior)
	 @Override
	 public void schedule() {
	     System.out.println("Event '" + eventName + "' scheduled on " + date);
	 }

	 @Override
	 public void reschedule(String newDate) {
	     this.date = newDate;
	     System.out.println("Event '" + eventName + "' rescheduled to " + date);
	 }

	 @Override
	 public void cancel() {
	     System.out.println("Event '" + eventName + "' has been canceled.");
	 }
	}
