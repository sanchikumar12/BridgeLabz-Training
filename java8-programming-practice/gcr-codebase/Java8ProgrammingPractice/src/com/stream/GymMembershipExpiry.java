package com.stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class GymMember {
    String name;
    LocalDate expiryDate;

    GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry Date: " + expiryDate;
    }
}

public class GymMembershipExpiry {
    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
            new GymMember("Alice", LocalDate.now().plusDays(10)),
            new GymMember("Bob", LocalDate.now().plusDays(45)),
            new GymMember("Charlie", LocalDate.now().plusDays(25)),
            new GymMember("David", LocalDate.now().minusDays(5)),
            new GymMember("Emma", LocalDate.now().plusDays(30))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<GymMember> expiringSoon = members.stream()
            .filter(m -> !m.expiryDate.isBefore(today) &&
                         !m.expiryDate.isAfter(next30Days))
            .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}

