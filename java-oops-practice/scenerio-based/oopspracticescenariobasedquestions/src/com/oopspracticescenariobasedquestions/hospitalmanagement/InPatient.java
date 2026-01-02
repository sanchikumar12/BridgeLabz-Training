package com.oopspracticescenariobasedquestions.hospitalmanagement;
public class InPatient extends Patient {
    private int roomNumber;
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, String history,
                     int roomNumber, int daysAdmitted) {
        super(patientId, name, age, history);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
    }

    public void displayInfo() {
        System.out.println("In-Patient: " + name +
                ", Room: " + roomNumber +
                ", Days: " + daysAdmitted);
    }
}
