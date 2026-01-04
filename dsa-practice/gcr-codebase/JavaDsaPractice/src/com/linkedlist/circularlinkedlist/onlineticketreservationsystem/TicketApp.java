package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

import java.util.Scanner;

//Main class to run the application
public class TicketApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     TicketList ticketList = new TicketList();
     int choice;

     // Menu-driven program
     do {
         System.out.println("\nOnline Ticket Reservation System");
         System.out.println("*** Welcome to Online Ticket Reservation System for movie ***");
         System.out.println("1. Book Ticket");
         System.out.println("2. Cancel Ticket");
         System.out.println("3. Display Tickets");
         System.out.println("4. Search Ticket");
         System.out.println("5. Count Tickets");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");

         choice = sc.nextInt();
         sc.nextLine(); // Consume newline

         switch (choice) {

             case 1:
                 // Input ticket details
                 System.out.print("Enter Ticket ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Customer Name: ");
                 String cname = sc.nextLine();

                 System.out.print("Enter Movie Name: ");
                 String mname = sc.nextLine();

                 System.out.print("Enter Seat Number: ");
                 String seat = sc.nextLine();

                 System.out.print("Enter Booking Time: ");
                 String time = sc.nextLine();

                 // Add ticket
                 ticketList.addTicket(id, cname, mname, seat, time);
                 break;

             case 2:
                 // Remove ticket
                 System.out.print("Enter Ticket ID to cancel: ");
                 ticketList.removeTicket(sc.nextInt());
                 break;

             case 3:
                 // Display tickets
                 ticketList.displayTickets();
                 break;

             case 4:
                 // Search ticket
                 System.out.print("Enter Customer Name or Movie Name: ");
                 ticketList.searchTicket(sc.nextLine());
                 break;

             case 5:
                 // Count tickets
                 System.out.println("Total Booked Tickets: " +
                         ticketList.countTickets());
                 break;

             case 6:
                 // Exit program
                 System.out.println("Thankyou for using the system");
                 break;

             default:
                 System.out.println("Invalid choice");
         }

     } while (choice != 6);

     sc.close();
 }
}
