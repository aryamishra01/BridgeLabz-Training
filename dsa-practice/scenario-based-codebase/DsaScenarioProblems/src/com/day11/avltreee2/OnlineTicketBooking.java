package com.day11.avltreee2;

import java.util.Scanner;

public class OnlineTicketBooking {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Event bst = new Event();

	        while (true) {

	            System.out.println("\nMenu");
	            System.out.println("1 Insert Event");
	            System.out.println("2 Cancel Event");
	            System.out.println("3 Show Events in Order");
	            System.out.println("4 Exit");

	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            switch (ch) {

	                case 1:
	                    System.out.print("Enter event time as integer: ");
	                    int time = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter event name: ");
	                    String name = sc.nextLine();
	                    bst.addEvent(time, name);
	                    break;

	                case 2:
	                    System.out.print("Enter event time to cancel: ");
	                    int t = sc.nextInt();
	                    bst.cancelEvent(t);
	                    break;

	                case 3:
	                    bst.showEvents();
	                    break;

	                case 4:
	                    System.out.println("Exiting");
	                    return;

	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
}
