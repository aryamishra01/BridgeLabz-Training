package com.day3.parceltracker;

/*
 * Manages the delivery chain using Singly Linked List
 */
public class ParcelTracker {

    private StageNode head;

    // Initialize default delivery stages
    public ParcelTracker() {
        head = new StageNode("Packed");

        StageNode shipped = new StageNode("Shipped");
        StageNode inTransit = new StageNode("In Transit");
        StageNode delivered = new StageNode("Delivered");

        head.next = shipped;
        shipped.next = inTransit;
        inTransit.next = delivered;
    }

    // Forward tracking of parcel
    public void trackParcel() {
        StageNode temp = head;

        System.out.println("\nParcel Tracking Status:");
        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Add a custom checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) {

        StageNode temp = head;

        while (temp != null && !temp.stageName.equalsIgnoreCase(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Checkpoint \"" + newStage + "\" added after \"" + afterStage + "\"");
    }

    // Handle lost or missing parcel (null pointer case)
    public void markParcelLost(String stage) {

        StageNode temp = head;

        while (temp != null && !temp.stageName.equalsIgnoreCase(stage)) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Parcel already delivered or stage not found.");
            return;
        }

        // Breaking the chain simulates lost parcel
        temp.next = null;
        System.out.println("Parcel lost after stage: " + stage);
    }
}

