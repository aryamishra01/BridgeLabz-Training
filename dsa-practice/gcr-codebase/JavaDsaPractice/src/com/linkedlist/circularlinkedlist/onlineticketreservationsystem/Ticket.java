package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

//This class represents a single ticket (node) in the circular linked list
public class Ticket {

 // Ticket details
 int ticketId;
 String customerName;
 String movieName;
 String seatNumber;
 String bookingTime;

 // Reference to next ticket
 Ticket next;

 // Constructor to initialize ticket details
 public Ticket(int ticketId, String customerName, String movieName,
               String seatNumber, String bookingTime) {
     this.ticketId = ticketId;
     this.customerName = customerName;
     this.movieName = movieName;
     this.seatNumber = seatNumber;
     this.bookingTime = bookingTime;
     this.next = null;
 }
}
