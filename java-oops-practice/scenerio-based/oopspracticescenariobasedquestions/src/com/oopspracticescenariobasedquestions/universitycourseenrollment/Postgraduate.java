package com.oopspracticescenariobasedquestions.universitycourseenrollment;

public class Postgraduate extends Student {

    public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    public void calculateGPA(double totalPoints, int subjects) {
        setGPA((totalPoints / subjects) + 0.5);
    }
}
