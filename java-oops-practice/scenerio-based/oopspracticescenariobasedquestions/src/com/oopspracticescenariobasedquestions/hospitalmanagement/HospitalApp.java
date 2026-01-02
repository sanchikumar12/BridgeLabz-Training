package com.oopspracticescenariobasedquestions.hospitalmanagement;

public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 30,
                "Diabetes", 205, 5);

        Patient p2 = new OutPatient(102, "Anita", 25,
                "Fever", "02-Jan-2026");

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");

        Bill bill = new Bill(5001, 10000, 0.05, 500);

        
        p1.displayInfo();
        p2.displayInfo();

        d1.assignPatient(p1);
        bill.generateBill();
    }
}
