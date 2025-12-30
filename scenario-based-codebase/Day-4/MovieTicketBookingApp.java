/*
Movie Ticket Booking App 
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        do {
            int ticketPrice = 0;
            int snackPrice = 0;

            System.out.println("\n--- Movie Ticket Booking ---");

            System.out.print("Enter movie type (1-Hollywood, 2-Bollywood, 3-Animation): ");
            int movieType = input.nextInt();

            System.out.print("Enter seat type (gold/silver): ");
            String seatType = input.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = input.next();

            // switch for movie type
            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type!");
            }

            // if condition for seat type
            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 50;
            }

            // if condition for snacks
            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            int totalBill = ticketPrice + snackPrice;

            System.out.println("\n---- Booking Summary ----");
            System.out.println("Ticket Price : " + ticketPrice);
            System.out.println("Snack Charges : " + snackPrice);
            System.out.println("Total Amount : " + totalBill);

            System.out.print("\nBook ticket for another customer? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Movie Ticket Booking App!");
    }
}
