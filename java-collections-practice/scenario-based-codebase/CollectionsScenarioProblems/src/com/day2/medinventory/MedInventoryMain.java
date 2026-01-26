package com.day2.medinventory;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MedInventoryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Item<String>> inventory = new HashSet<>();

        while (true) {

            System.out.println("\n===== MedInventory Menu =====");
            System.out.println("1. Load Inventory CSV");
            System.out.println("2. Show Expired Items");
            System.out.println("3. Group Items by Type");
            System.out.println("4. Check Low Stock");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {

                    case 1:
                        System.out.print("Enter CSV file path: ");
                        String path = sc.nextLine();
                        inventory = InventoryReader.readCSV(path, "Medical");
                        break;

                    case 2:
                        InventoryAnalyzer.showExpired(inventory);
                        break;

                    case 3:
                        Map<String, List<Item<String>>> map =
                                InventoryAnalyzer.groupByType(inventory);

                        for (String k : map.keySet()) {
                            System.out.println("\n" + k);
                            for (Item<String> i : map.get(k))
                                System.out.println(i);
                        }
                        break;

                    case 4:
                        InventoryAnalyzer.checkLowStock(inventory);
                        break;

                    case 5:
                        System.out.println("Bye!");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (LowStockException e) {
                System.out.println("ALERT: " + e.getMessage());
            }
        }
    }
}

