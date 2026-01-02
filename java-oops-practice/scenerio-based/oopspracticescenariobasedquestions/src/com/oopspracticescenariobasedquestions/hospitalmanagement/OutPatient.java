package com.oopspracticescenariobasedquestions.hospitalmanagement;

public class OutPatient extends Patient {
    private String visitDate;

    public OutPatient(int patientId, String name, int age,
                      String history, String visitDate) {
        super(patientId, name, age, history);
        this.visitDate = visitDate;
    }

    public void displayInfo() {
        System.out.println("Out-Patient: " + name +
                ", Visit Date: " + visitDate);
    }
}
