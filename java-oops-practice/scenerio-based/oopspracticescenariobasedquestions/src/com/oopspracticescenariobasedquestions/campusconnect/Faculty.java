package com.oopspracticescenariobasedquestions.campusconnect;

import java.util.ArrayList;
import java.util.List;

class Faculty extends Person implements ICourseActions {

	 private List<Course> teachingCourses = new ArrayList<>();

	 public Faculty(String id, String name, String email) {
	     super(id, name, email);
	 }

	 @Override
	 public void enrollCourse(Course c) {
	     teachingCourses.add(c);
	     c.setFaculty(this);
	 }

	 @Override
	 public void dropCourse(Course c) {
	     teachingCourses.remove(c);
	     c.setFaculty(null);
	 }

	 @Override
	 public void printDetails() {
	     System.out.println("---- Faculty Details ----");
	     System.out.println("ID: " + id);
	     System.out.println("Name: " + name);
	     System.out.println("Email: " + email);
	     System.out.println("Courses Teaching: " + teachingCourses.size());
	 }
	}
