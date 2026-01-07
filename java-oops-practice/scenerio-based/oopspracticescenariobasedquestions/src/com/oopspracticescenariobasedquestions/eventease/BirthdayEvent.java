package com.oopspracticescenariobasedquestions.eventease;

class BirthdayEvent extends Event {

	 private String theme;

	 public BirthdayEvent(String name, String location, String date, int attendees, 
	                      User organizer, String theme) {
	     super(name, location, date, attendees, organizer);
	     this.theme = theme;
	 }

	 @Override
	 public void schedule() {
	     System.out.println("🎉 Birthday Event themed '" + theme + "' scheduled on " + date 
	         + " by " + organizer.getName());
	 }
	}