package com.day7.tourmate;

class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    // Different booking logic for international trips
    @Override
    public void book() {
        double visaFee = 5000; // additional charge
        double finalAmount = totalBudget + visaFee;

        System.out.println("International Trip Booked!");
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Visa Fee: ₹" + visaFee);
        System.out.println("Total Budget: ₹" + finalAmount);
    }
}

