package com.oopspracticescenariobasedquestions.eventease;
class ConferenceEvent extends Event {

	 private String speaker;

	 public ConferenceEvent(String name, String location, String date, int attendees, 
	                        User organizer, String speaker) {
	     super(name, location, date, attendees, organizer);
	     this.speaker = speaker;
	 }

	 @Override
	 public void schedule() {
	     System.out.println("📢 Conference with speaker '" + speaker + "' scheduled on " + date 
	         + " at " + location);
	 }
	}