package Day_12_Hackerrank;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    protected String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }
}

class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, String course, String thesisTitle) {
        super(name, course);
        this.thesisTitle = thesisTitle;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Course       : " + course);
        System.out.println("Thesis Title : " + thesisTitle);
    }
}

public class Q8 {
    public static void main(String[] args) {
        System.out.println("=== Multi-Level Inheritance & Constructor Chaining ===");
        GraduateStudent grad = new GraduateStudent(
            "Aman Gupta",
            "Artificial Intelligence",
            "Real-Time Video Super-Resolution using Transformers"
        );

        grad.displayStudentDetails();
    }
}
