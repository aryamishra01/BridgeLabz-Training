package com.day1.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
    String city;
    String country;
    int days;
    String notes;

    public Trip(String city, String country, int days, String notes) {
        this.city = city;
        this.country = country;
        this.days = days;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return city + ", " + country + " | Days: " + days + " | Notes: " + notes;
    }
}

