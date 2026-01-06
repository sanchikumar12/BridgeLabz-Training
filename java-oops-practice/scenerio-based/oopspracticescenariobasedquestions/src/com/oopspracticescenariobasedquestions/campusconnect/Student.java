package com.oopspracticescenariobasedquestions.campusconnect;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements ICourseActions {

	 private List<Course> enrolledCourses = new ArrayList<>();
	 private List<Double> grades = new ArrayList<>();  

	 public Student(String id, String name, String email) {
	     super(id, name, email);
	 }

	 public void addGrade(double grade) {
	     grades.add(grade);
	 }

	 // GPA calculation using operators
	 public double calculateGPA() {
	     if (grades.isEmpty()) return 0.0;

	     double sum = 0;
	     for (double g : grades) {
	         sum += g;
	     }
	     return sum / grades.size(); // simple average = GPA
	 }

	 @Override
	 public void enrollCourse(Course c) {
	     enrolledCourses.add(c);
	     c.addStudent(this);
	 }

	 @Override
	 public void dropCourse(Course c) {
	     enrolledCourses.remove(c);
	     c.removeStudent(this);
	 }

	 @Override
	 public void printDetails() {
	     System.out.println("---- Student Details ----");
	     System.out.println("ID: " + id);
	     System.out.println("Name: " + name);
	     System.out.println("Email: " + email);
	     System.out.println("Enrolled Courses: " + enrolledCourses.size());
	     System.out.println("Current GPA: " + calculateGPA());
	 }
	}