package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;

    String description;
    String country;
    int durationDays;

    public Trip(String description, String country, int durationDays) {
        this.description = description;
        this.country = country;
        this.durationDays = durationDays;
    }

    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationDays() {
        return durationDays;
    }
}
