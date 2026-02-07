package com.SchoolSystem;


import java.util.*;
import java.util.function.*;

public class StudentLambdaDemo {

    static class Student {
        String name;
        int age;
        int marks;
        int rank;

        Student(String name, int age, int marks, int rank) {
            this.name = name;
            this.age = age;
            this.marks = marks;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return name + " | Age: " + age + " | Marks: " + marks + " | Rank: " + rank;
        }
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Suresh", 20, 75, 3),
            new Student("Anita", 17, 45, 5),
            new Student("Rahul", 22, 88, 1),
            new Student("Sneha", 19, 65, 2)
        );

        /* 1. Lambda to print welcome message */
        Consumer<Student> welcome =
                s -> System.out.println("Welcome to the school, " + s.name + "!");
        students.forEach(welcome);

        System.out.println("\n----------------------");

        /* 2. Lambda to check pass or fail */
        Predicate<Student> passFail =
                s -> s.marks >= 50;

        students.forEach(s ->
            System.out.println(s.name + " : " + (passFail.test(s) ? "PASS" : "FAIL"))
        );

        System.out.println("\n----------------------");

        /* 3. Sort students by name using lambda */
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by Name:");
        students.forEach(System.out::println);

        System.out.println("\n----------------------");

        /* 4. Sort students by rank using lambda */
        students.sort((s1, s2) -> Integer.compare(s1.rank, s2.rank));
        System.out.println("Sorted by Rank:");
        students.forEach(System.out::println);

        System.out.println("\n----------------------");

        /* 5. Display students whose age is above 18 */
        System.out.println("Students above age 18:");
        students.stream()
                .filter(s -> s.age > 18)
                .forEach(System.out::println);
    }
}
