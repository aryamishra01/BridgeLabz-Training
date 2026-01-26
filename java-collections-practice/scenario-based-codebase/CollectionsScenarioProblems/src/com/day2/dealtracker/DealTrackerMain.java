package com.day2.dealtracker;

import java.util.*;

public class DealTrackerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DealManager manager = new DealManager();

        while (true) {

            System.out.println("\n===== Deal Tracker =====");
            System.out.println("1. Load Deal File");
            System.out.println("2. Show Valid Deals");
            System.out.println("3. Sort by Discount");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {

                    case 1:
                        System.out.print("Enter file path: ");
                        String path = sc.nextLine();

                        System.out.print("Enter promo type (Discount/Cashback/Referral): ");
                        String type = sc.nextLine();

                        List<Deal<String>> deals =
                                DealFileReader.readDeals(path, type);

                        manager.addDeals(deals);
                        break;

                    case 2:
                        manager.showAll();
                        break;

                    case 3:
                        manager.sortByDiscount();
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }
}

