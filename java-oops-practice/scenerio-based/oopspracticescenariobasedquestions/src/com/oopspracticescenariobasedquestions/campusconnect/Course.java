package com.oopspracticescenariobasedquestions.campusconnect;

import java.util.ArrayList;
import java.util.List;

class Course {
	 private String courseId;
	 private String courseName;
	 private Faculty faculty;               // Assigned faculty
	 private List<Student> students;        // Students enrolled

	 public Course(String courseId, String courseName) {
	     this.courseId = courseId;
	     this.courseName = courseName;
	     this.students = new ArrayList<>();
	 }

	 public void setFaculty(Faculty f) {
	     this.faculty = f;
	 }

	 public void addStudent(Student s) {
	     students.add(s);
	 }

	 public void removeStudent(Student s) {
	     students.remove(s);
	 }

	 public void printCourseInfo() {
	     System.out.println("===== Course Info =====");
	     System.out.println("Course ID: " + courseId);
	     System.out.println("Course Name: " + courseName);
	     System.out.println("Faculty: " + (faculty != null ? faculty.name : "None"));
	     System.out.println("Total Students: " + students.size());
	 }
	}
