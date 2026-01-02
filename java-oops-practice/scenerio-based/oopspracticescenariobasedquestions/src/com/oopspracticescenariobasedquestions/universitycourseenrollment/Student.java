package com.oopspracticescenariobasedquestions.universitycourseenrollment;

public class Student {
    protected int studentId;
    protected String name;
    private double gpa;  

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    protected void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double viewTranscript() {
        return gpa;
    }
}

