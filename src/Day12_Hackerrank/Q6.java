package Day12_Hackerrank;

class Address {

    String street;
    String city;
    int zipCode;

    Address(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    Address(Address a) {
        this.street = a.street;
        this.city = a.city;
        this.zipCode = a.zipCode;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Student(Student s) {
        this.name = s.name;
        this.address = new Address(s.address);
    }
}

public class Q6 {

    public static void main(String[] args) {

        Address a = new Address("MG Road", "Ranchi", 834001);

        Student originalStudent = new Student("Sanchit", a);

        Student copiedStudent = new Student(originalStudent);

        copiedStudent.address.city = "Delhi";

        System.out.println("Original: " + originalStudent.address.city);
        System.out.println("Copy: " + copiedStudent.address.city);
    }
}