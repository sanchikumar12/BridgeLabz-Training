package com.oopspracticescenariobasedquestions.universitycourseenrollment;

public class UniversityApp {
    public static void main(String[] args) {

        Student ug = new Undergraduate(1, "Amit");
        Student pg = new Postgraduate(2, "Neha");

        Course course1 = new Course("CS101", "Java Programming");

        Faculty faculty = new Faculty(1001, "Dr. Rao");

        Enrollment e1 = new Enrollment(ug, course1);
        Enrollment e2 = new Enrollment(pg, course1);

        faculty.gradeStudent(e1, "A");//downtype casting
        faculty.gradeStudent(e2, "Pass");

        ((Undergraduate) ug).calculateGPA(32, 8);
        ((Postgraduate) pg).calculateGPA(30, 6);

        System.out.println("UG GPA: " + ug.viewTranscript());
        System.out.println("PG GPA: " + pg.viewTranscript());
    }
}
