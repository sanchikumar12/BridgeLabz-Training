package com.constructor.level1;
class Course {

    // Instance Variables
    private String courseName;
    private int duration; // in hours or months
    private double fee;

    // Class Variable (common to all courses)
    private static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " hours");
        System.out.println("Fee            : ₹" + fee);
        System.out.println();
    }

    // Class Method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}


// Driver Class
public class Main {
    public static void main(String[] args) {

        // Initial institute name is "ABC Institute"
        Course c1 = new Course("Java Programming", 40, 5000);
        Course c2 = new Course("Web Development", 60, 8000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("Tech Academy");

        // Display again after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
