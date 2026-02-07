package com.StudentsManagement;
import java.util.*;
import java.util.stream.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class StudentStreamDemo {

    static class Student {
        int id;
        String name;
        String department;
        int age;
        String gender;
        String city;
        int rank;
        List<String> contacts;

        Student(int id, String name, String department, int age,
                String gender, String city, int rank, List<String> contacts) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.age = age;
            this.gender = gender;
            this.city = city;
            this.rank = rank;
            this.contacts = contacts;
        }

        public String toString() {
            return name + " (" + department + ", rank=" + rank + ")";
        }
    }

    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student(1,"Suresh","Mechanical",28,"Male","Mumbai",45,List.of("9991","9992")),
            new Student(2,"Anita","Computer",22,"Female","Delhi",12,List.of("8881")),
            new Student(3,"Ravi","Electronics",26,"Male","Karnataka",88,List.of("7771","7772")),
            new Student(4,"Sneha","Mechanical",24,"Female","Pune",9,List.of("6661")),
            new Student(5,"Rahul","Computer",30,"Male","Mumbai",120,List.of("5551")),
            new Student(6,"Simran","Biotech",21,"Female","Karnataka",67,List.of("4441","4442")),
            new Student(7,"Amit","Civil",27,"Male","Delhi",200,List.of("3331"))
        );


        students.stream().filter(s -> s.rank < 50).forEach(System.out::println);
        students.stream().filter(s -> s.age > 25).forEach(System.out::println);
        students.stream().map(s -> s.name).forEach(System.out::println);
        students.stream().filter(s -> s.department.equals("Mechanical")).forEach(System.out::println);
        students.stream().filter(s -> !s.city.equals("Mumbai")).forEach(System.out::println);


        students.stream().sorted(comparingInt(s -> s.rank)).forEach(System.out::println);
        students.stream().sorted(comparingInt((Student s) -> s.age).reversed()).forEach(System.out::println);
        students.stream().sorted(comparingInt(s -> s.rank)).limit(5).forEach(System.out::println);
       
      

      
        System.out.println(students.stream().collect(groupingBy(s -> s.department, counting())));
        System.out.println(students.stream().collect(groupingBy(s -> s.city, counting())));
        System.out.println(students.stream().collect(groupingBy(s -> s.department, averagingInt(s -> s.age))));
        System.out.println(students.stream().collect(groupingBy(s -> s.gender, averagingInt(s -> s.rank))));
        System.out.println(students.size());

        students.stream()
            .collect(groupingBy(s -> s.department, averagingInt(s -> s.rank)))
            .entrySet().stream().max(Map.Entry.comparingByValue())
            .ifPresent(System.out::println);


        students.stream().min(comparingInt(s -> s.rank)).ifPresent(System.out::println);
        students.stream().max(comparingInt(s -> s.rank)).ifPresent(System.out::println);
        students.stream().sorted(comparingInt(s -> s.rank)).skip(1).findFirst().ifPresent(System.out::println);
        students.stream().sorted(comparingInt(s -> s.rank)).skip(2).findFirst().ifPresent(System.out::println);
        students.stream().min(comparingInt(s -> s.age)).ifPresent(System.out::println);
        students.stream().max(comparingInt(s -> s.age)).ifPresent(System.out::println);

    
        students.stream().flatMap(s -> s.contacts.stream()).forEach(System.out::println);
        System.out.println(students.stream().flatMap(s -> s.contacts.stream()).count());
        students.stream().filter(s -> s.contacts.size() > 1).forEach(System.out::println);
        students.stream().flatMap(s -> s.contacts.stream()).distinct().forEach(System.out::println);


        System.out.println(students.stream().anyMatch(s -> s.department.equals("Biotech")));
        System.out.println(students.stream().allMatch(s -> s.age > 20));
        System.out.println(students.stream().noneMatch(s -> s.department.equals("Civil")));


        System.out.println(students.stream().collect(groupingBy(s -> s.gender, counting())));
        System.out.println(students.stream().filter(s -> s.gender.equals("Male")).collect(averagingInt(s -> s.age)));
        System.out.println(students.stream().filter(s -> s.gender.equals("Female")).collect(averagingInt(s -> s.age)));
        students.stream().filter(s -> s.gender.equals("Male")).min(comparingInt(s -> s.rank)).ifPresent(System.out::println);
        students.stream().filter(s -> s.gender.equals("Female")).min(comparingInt(s -> s.rank)).ifPresent(System.out::println);

       
        System.out.println(students.stream().collect(groupingBy(s -> s.department, mapping(s -> s.name, toList()))));
        students.stream().filter(s -> s.department.equals("Computer")).min(comparingInt(s -> s.age)).ifPresent(System.out::println);
        students.stream().filter(s -> s.department.equals("Mechanical")).min(comparingInt(s -> s.rank)).ifPresent(System.out::println);
        System.out.println(students.stream().filter(s -> s.department.equals("Electronics") && s.city.equals("Karnataka")).count());

      
        System.out.println(students.stream().collect(toMap(s -> s.id, s -> s.name)));
        System.out.println(students.stream().collect(groupingBy(s -> s.department)));
        students.stream().filter(s -> s.name.startsWith("S")).forEach(System.out::println);
        students.stream().filter(s -> s.name.length() > 5).forEach(System.out::println);
        students.stream().filter(s -> s.rank % 2 == 0).forEach(System.out::println);
        students.stream().filter(s -> s.rank % 2 != 0).forEach(System.out::println);

        /* ================= BONUS ================= */
        students.stream().sorted(comparingInt(s -> s.age)).limit(3).forEach(System.out::println);
        students.stream().sorted(comparingInt((Student s) -> s.age).reversed()).limit(3).forEach(System.out::println);
        System.out.println(students.stream().collect(partitioningBy(s -> s.age > 25)));
        System.out.println(students.stream().collect(partitioningBy(s -> s.rank < 100)));

        students.stream().collect(groupingBy(s -> s.city, counting()))
            .entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        students.stream().collect(groupingBy(s -> s.department, counting()))
            .entrySet().stream().min(Map.Entry.comparingByValue()).ifPresent(System.out::println);
    }
}
