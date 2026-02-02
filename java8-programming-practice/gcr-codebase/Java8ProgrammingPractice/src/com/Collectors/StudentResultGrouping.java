package com.Collectors;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String gradeLevel;

    Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Alice", "Grade 10"),
            new Student("Bob", "Grade 11"),
            new Student("Charlie", "Grade 10"),
            new Student("Diana", "Grade 12"),
            new Student("Eve", "Grade 11")
        );

        Map<String, List<String>> studentsByGrade =
            students.stream()
                    .collect(Collectors.groupingBy(
                        s -> s.gradeLevel,
                        Collectors.mapping(s -> s.name, Collectors.toList())
                    ));

        studentsByGrade.forEach((grade, names) ->
            System.out.println(grade + " -> " + names)
        );
    }
}
