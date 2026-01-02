package com.oopspracticescenariobasedquestions.universitycourseenrollment;

public class Enrollment implements Graded {
    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void assignGrade(String grade) {
        this.grade = grade;
        System.out.println("Grade " + grade + " assigned for " + course.getTitle());
    }
}
