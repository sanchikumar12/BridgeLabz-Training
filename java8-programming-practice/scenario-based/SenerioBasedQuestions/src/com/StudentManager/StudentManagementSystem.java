package com.StudentManager;

import java.util.*;

class Student {
    int id;
    String name;
    String nickname;
    String email;
    String phone;
    Address address;

    Student(int id, String name, String nickname,
            String email, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    Optional<String> getPhone() {
        return Optional.ofNullable(phone);
    }

    Optional<String> getNickname() {
        return Optional.ofNullable(nickname);
    }

    Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    Optional<String> getCity() {
        return Optional.ofNullable(city);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Aman", "Ami",
                        "aman@gmail.com", null, new Address("Delhi")),
                new Student(2, "Riya", null,
                        null, "9999999999", null)
        );

    
        students.forEach(s ->
                System.out.println("Email: " +
                        s.getEmail().orElse("Email not provided"))
        );


        students.forEach(s ->
                System.out.println("Phone: " +
                        s.getPhone().orElse("0000000000"))
        );

        int searchId = 3;
        Student foundStudent = students.stream()
                .filter(s -> s.id == searchId)
                .findFirst()
                .orElse(null);

        Optional.ofNullable(foundStudent)
                .ifPresentOrElse(
                        s -> System.out.println("Student found: " + s.name),
                        () -> System.out.println("Student not available")
                );


        students.forEach(s -> {
            String city = s.getAddress()
                    .flatMap(Address::getCity)
                    .orElse("Address not available");
            System.out.println("City: " + city);
        });


        students.forEach(s -> {
            String displayName = s.getNickname().orElse(s.name);
            System.out.println("Display Name: " + displayName);
        });
    }
}
