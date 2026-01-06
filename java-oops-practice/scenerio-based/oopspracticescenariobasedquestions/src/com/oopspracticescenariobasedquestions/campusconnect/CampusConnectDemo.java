package com.oopspracticescenariobasedquestions.campusconnect;

import java.util.*;



public class CampusConnectDemo {
 public static void main(String[] args) {

     // Create faculty
     Faculty f1 = new Faculty("F101", "Dr. Sharma", "sharma@univ.edu");

     // Create students
     Student s1 = new Student("S001", "Amit", "amit@univ.edu");
     Student s2 = new Student("S002", "Riya", "riya@univ.edu");

     // Create course
     Course c1 = new Course("CSE101", "OOP in Java");

     // Faculty enrolls to teach course
     f1.enrollCourse(c1);

     // Students enroll in course
     s1.enrollCourse(c1);
     s2.enrollCourse(c1);

     // Add grades
     s1.addGrade(8.5);
     s1.addGrade(9.0);
     s2.addGrade(7.0);
     s2.addGrade(8.0);

     // Display details
     f1.printDetails();
     s1.printDetails();
     s2.printDetails();
     c1.printCourseInfo();
 }
}
