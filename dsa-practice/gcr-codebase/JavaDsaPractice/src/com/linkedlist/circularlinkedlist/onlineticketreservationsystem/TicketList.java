package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

//This class contains all operations on the circular linked list
public class TicketList {

 // Points to the last node of the circular linked list
 private Ticket last;

 // Constructor initializes an empty list
 public TicketList() {
     last = null;
 }

 // Method to add a new ticket at the end of the list
 public void addTicket(int id, String cname, String mname,
                       String seat, String time) {

     // Create a new ticket node
     Ticket newTicket = new Ticket(id, cname, mname, seat, time);

     // If list is empty
     if (last == null) {
         last = newTicket;
         last.next = last;   // Circular link to itself
     }
     // If list already has tickets
     else {
         newTicket.next = last.next; // Point to first ticket
         last.next = newTicket;      // Link last to new ticket
         last = newTicket;           // Update last pointer
     }

     System.out.println("Ticket booked successfully");
 }

 // Method to remove a ticket using Ticket ID
 public void removeTicket(int id) {

     // If list is empty
     if (last == null) {
         System.out.println("No tickets available");
         return;
     }

     Ticket current = last.next; // Start from first ticket
     Ticket prev = last;         // Previous ticket reference

     // Traverse the circular linked list
     do {
         // If ticket ID matches
         if (current.ticketId == id) {

             // Case 1: Only one ticket in list
             if (current == last && current.next == last) {
                 last = null;
             }
             // Case 2: More than one ticket
             else {
                 prev.next = current.next;

                 // If removing last ticket
                 if (current == last) {
                     last = prev;
                 }
             }

             System.out.println("Ticket cancelled successfully");
             return;
         }

         prev = current;
         current = current.next;

     } while (current != last.next);

     // Ticket not found
     System.out.println("Ticket ID not found");
 }

 // Method to display all booked tickets
 public void displayTickets() {

     // If list is empty
     if (last == null) {
         System.out.println("No tickets booked");
         return;
     }

     Ticket temp = last.next; // Start from first ticket
     System.out.println("\nTicket Details:");

     // Traverse circular linked list
     do {
         System.out.println("Ticket ID: " + temp.ticketId);
         System.out.println("Customer Name: " + temp.customerName);
         System.out.println("Movie Name: " + temp.movieName);
         System.out.println("Seat Number: " + temp.seatNumber);
         System.out.println("Booking Time: " + temp.bookingTime);
         System.out.println("----------------------");

         temp = temp.next;

     } while (temp != last.next);
 }

 // Method to search ticket by Customer Name or Movie Name
 public void searchTicket(String key) {

     // If list is empty
     if (last == null) {
         System.out.println("No tickets available");
         return;
     }

     Ticket temp = last.next; // Start from first ticket
     boolean found = false;

     // Traverse list
     do {
         // Check customer name or movie name
         if (temp.customerName.equalsIgnoreCase(key) ||
             temp.movieName.equalsIgnoreCase(key)) {

             System.out.println("Ticket Found");
             System.out.println("Ticket ID: " + temp.ticketId);
             System.out.println("Customer Name: " + temp.customerName);
             System.out.println("Movie Name: " + temp.movieName);
             found = true;
         }

         temp = temp.next;

     } while (temp != last.next);

     // If no ticket matched
     if (!found) {
         System.out.println("No matching ticket found");
     }
 }

 // Method to count total number of tickets
 public int countTickets() {

     // If list is empty
     if (last == null) {
         return 0;
     }

     int count = 0;
     Ticket temp = last.next;

     // Traverse circular linked list
     do {
         count++;
         temp = temp.next;
     } while (temp != last.next);

     return count;
 }
}
