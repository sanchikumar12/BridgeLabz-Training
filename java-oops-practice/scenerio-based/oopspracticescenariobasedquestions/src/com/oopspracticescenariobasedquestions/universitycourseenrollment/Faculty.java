package com.oopspracticescenariobasedquestions.universitycourseenrollment;

public class Faculty {
    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public void gradeStudent(Enrollment enrollment, String grade) {
        enrollment.assignGrade(grade);
    }
}

