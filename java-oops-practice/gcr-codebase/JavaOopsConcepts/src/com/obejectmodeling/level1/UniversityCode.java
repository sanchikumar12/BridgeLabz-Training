package com.obejectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);  // Association
        System.out.println(name + " enrolled in " + course.getTitle());
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}


class Professor {
    private String name;
    private String department;
    private List<Course> teachingCourses;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.teachingCourses = new ArrayList<>();
    }

    public void assignProfessor(Course course) {
        teachingCourses.add(course);
        course.setProfessor(this);  // Association
        System.out.println(name + " assigned to teach " + course.getTitle());
    }

    @Override
    public String toString() {
        return "Professor{name='" + name + "', department='" + department + "'}";
    }
}


class Course {
    private String title;
    private int code;

    
    private Professor professor;
    private List<Student> students;

    public Course(String title, int code) {
        this.title = title;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public String getTitle() {
        return title;
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + title + " (" + code + ")");
        System.out.println("Professor: " + (professor != null ? professor : "Not assigned"));

        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(" - " + s);
        }
    }
}


public class UniversityCode {
    public static void main(String[] args) {

        // Creating students
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        // Creating professor
        Professor p1 = new Professor("Dr. Smith", "Computer Science");

        // Creating course
        Course c1 = new Course("Data Structures", 501);

        // Associations
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        p1.assignProfessor(c1);

        // Display details
        c1.showCourseDetails();
    }
}
