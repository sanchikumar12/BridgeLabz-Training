package com.stream;

import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    @Override
    public String toString() {
        return name + " | Specialty: " + specialty + 
               " | Weekend Available: " + availableOnWeekend;
    }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Emma", "Neurology", false),
            new Doctor("Dr. John", "Orthopedics", true),
            new Doctor("Dr. Sophia", "Dermatology", true),
            new Doctor("Dr. Alex", "Cardiology", false)
        );

        List<Doctor> weekendDoctors = doctors.stream()
            .filter(d -> d.availableOnWeekend)
            .sorted(Comparator.comparing(d -> d.specialty))
            .collect(Collectors.toList());

        weekendDoctors.forEach(System.out::println);
    }
}
