package com.methodreference.hospital;

import java.util.ArrayList;
import java.util.List;

public class PatientIdPrinting {

    public static void main(String[] args) {

        List<Integer> patientIds = new ArrayList<>();

        patientIds.add(101);
        patientIds.add(102);
        patientIds.add(103);
        patientIds.add(104);
        
        patientIds.forEach(System.out::println);
    }
}