package com.oopspracticescenariobasedquestions.universitycourseenrollment;

public class Undergraduate extends Student {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    public void calculateGPA(double totalPoints, int subjects) {
        setGPA(totalPoints / subjects);
    }
}
