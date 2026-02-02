package com.methodreference.nameuppercasing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {

    public static void main(String[] args) {

        List<String> employeeNames = new ArrayList<>();

        employeeNames.add("Vikash");
        employeeNames.add("Rahul");
        employeeNames.add("Amit");
        employeeNames.add("Neha");

        List<String> upperCaseNames = employeeNames
                .stream()                     
                .map(String::toUpperCase)     
                .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}