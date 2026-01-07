package com.oopspracticescenariobasedquestions.eventease;

class User {
	 private String name;
	 private String email;   // sensitive data

	 public User(String name, String email) {
	     this.name = name;
	     this.email = email;
	 }

	 // Encapsulation: sensitive fields accessed only via getters
	 public String getName() { return name; }
	 public String getEmail() { return email; }
	}
