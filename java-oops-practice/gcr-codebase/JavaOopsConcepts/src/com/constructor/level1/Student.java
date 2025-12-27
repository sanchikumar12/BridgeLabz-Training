// Parent Class
package com.constructor.level1;
class Student {

    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display method
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
        System.out.println();
    }
}


// Subclass demonstrating protected member access
class PostgraduateStudent extends Student {

    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        // Can access 'name' because it is protected (accessible in subclass)
        System.out.println("PG Student Name : " + name);
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("CGPA            : " + getCGPA());
        System.out.println("Research Topic  : " + researchTopic);
        System.out.println();
    }
}


// Driver Class
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Amit Verma", 8.5);
        s1.displayStudentDetails();

        // Modify CGPA using setter
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        // Postgraduate student object
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Riya Sharma", 8.8, "Machine Learning");
        pg1.displayPostgraduateDetails();
    }
}
