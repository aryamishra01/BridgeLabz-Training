package com.day7.tourmate;

class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    // Polymorphic booking logic
    @Override
    public void book() {
        System.out.println("Domestic Trip Booked!");
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: ₹" + totalBudget);
    }
}

