package com.day3.parceltracker;

import java.util.*;

public class ParcelTrackerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();

        // Add custom checkpoint
        System.out.print("\nEnter stage after which to add checkpoint: ");
        String afterStage = sc.nextLine();

        System.out.print("Enter new checkpoint name: ");
        String newStage = sc.nextLine();

        tracker.addCheckpoint(afterStage, newStage);
        tracker.trackParcel();

        // Simulate lost parcel
        System.out.print("\nEnter stage after which parcel is lost: ");
        String lostStage = sc.nextLine();

        tracker.markParcelLost(lostStage);
        tracker.trackParcel();

        sc.close();
    }
}

