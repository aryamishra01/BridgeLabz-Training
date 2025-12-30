/*
Train Reservation Queue 
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/
import java.util.Scanner;

public class TrainReservationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ecSeats = 3;
        int ccSeats = 5;

        System.out.println("------ Railway Reservation System ------");

        while (true) {

            if (ecSeats == 0 && ccSeats == 0) {
                System.out.println("All seats are booked. Reservation closed!");
                break;
            }

            System.out.println("\nAvailable Routes:");
            System.out.println("1. Bhopal to Delhi");
            System.out.println("2. Bhopal to Mumbai");

            System.out.print("Enter your route choice: ");
            int routeChoice = input.nextInt();

            switch (routeChoice) {

                case 1:
                    System.out.println("\nAvailable Trains:");
                    System.out.println("1. Vande Bharat Express");
                    System.out.println("2. Kerala Express");

                    System.out.print("Choose train: ");
                    int trainChoice = input.nextInt();

                    if (trainChoice == 1 || trainChoice == 2) {

                        System.out.println("\nSeat Types:");
                        System.out.println("1. EC (Available: " + ecSeats + ")");
                        System.out.println("2. CC (Available: " + ccSeats + ")");

                        System.out.print("Choose seat type: ");
                        int seatChoice = input.nextInt();

                        if (seatChoice == 1) {

                            if (ecSeats > 0) {
                                ecSeats--;
                                System.out.println("EC Seat booked successfully!");
                                System.out.println("Remaining EC seats: " + ecSeats);
                            } else {
                                System.out.println("EC seats not available.");
                            }

                        } else if (seatChoice == 2) {

                            if (ccSeats > 0) {
                                ccSeats--;
                                System.out.println("CC Seat booked successfully!");
                                System.out.println("Remaining CC seats: " + ccSeats);
                            } else {
                                System.out.println("CC seats not available.");
                            }

                        } else {
                            System.out.println("Invalid seat choice.");
                        }

                    } else {
                        System.out.println("Invalid train choice.");
                    }
                    break;

                case 2:
                    System.out.println("\nAvailable Trains:");
                    System.out.println("1. Pushpak Express");
                    System.out.println("2. Mumbai CSMT Express");

                    System.out.print("Choose train: ");
                    int mTrain = input.nextInt();

                    if (mTrain == 1 || mTrain == 2) {

                        System.out.println("\nSeat Types:");
                        System.out.println("1. EC (Available: " + ecSeats + ")");
                        System.out.println("2. CC (Available: " + ccSeats + ")");

                        System.out.print("Choose seat type: ");
                        int seatChoice2 = input.nextInt();

                        if (seatChoice2 == 1 && ecSeats > 0) {
                            ecSeats--;
                            System.out.println("EC Seat booked successfully!");
							System.out.println("Remaining EC seats: " + ecSeats);
                        } 
                        else if (seatChoice2 == 2 && ccSeats > 0) {
                            ccSeats--;
                            System.out.println("CC Seat booked successfully!");
							System.out.println("Remaining CC seats: " + ccSeats);
                        } 
                        else {
                            System.out.println("Seat not available.");
                        }

                    } else {
                        System.out.println("Invalid train choice.");
                    }
                    break;

                default:
                    System.out.println("Invalid route choice.");
            }

            System.out.print("\nDo you want to continue booking? (y/n): ");
            String again = input.next();

            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using Railway Reservation System.");
                break;
            }
        }

        input.close();
    }
}
