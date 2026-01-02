package com.oopspracticescenariobasedquestions.hospitalmanagement;

public class Patient {
    protected int patientId;
    protected String name;
    protected int age;
    private String medicalHistory; 

    // constructor
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Emergency admission 
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.age = 0;
        this.medicalHistory = "Emergency Case";
    }

    public String getSummary() {
        return "Patient: " + name + ", Age: " + age;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}
