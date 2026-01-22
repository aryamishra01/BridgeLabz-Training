package com.collections.insurancepolicysystemusingmap;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyMapSystem {

	// policyNumber -> Policy
    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

    // expiryDate -> list of policies
    static TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Insurance Policy Management ======");
            System.out.println("1. Add Policy");
            System.out.println("2. Get Policy by Number");
            System.out.println("3. Policies Expiring in 30 Days");
            System.out.println("4. Policies by Policyholder");
            System.out.println("5. Remove Expired Policies");
            System.out.println("6. Show All Policies (Insertion Order)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addPolicy(sc);
                case 2 -> getPolicyByNumber(sc);
                case 3 -> expiringSoon();
                case 4 -> policiesByHolder(sc);
                case 5 -> removeExpired();
                case 6 -> showAll();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ---------------- ADD POLICY ----------------
    static void addPolicy(Scanner sc) {

        System.out.print("Policy Number: ");
        int num = sc.nextInt();

        System.out.print("Holder Name: ");
        String name = sc.next();

        System.out.print("Coverage Type: ");
        String cover = sc.next();

        System.out.print("Premium: ");
        double premium = sc.nextDouble();

        System.out.print("Expiry Date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        Policy p = new Policy(num, name, date, cover, premium);

        hashMap.put(num, p);
        linkedHashMap.put(num, p);

        treeMap.putIfAbsent(date, new ArrayList<>());
        treeMap.get(date).add(p);

        System.out.println("Policy Added Successfully!");
    }

    // ---------------- GET BY NUMBER ----------------
    static void getPolicyByNumber(Scanner sc) {

        System.out.print("Enter Policy Number: ");
        int num = sc.nextInt();

        Policy p = hashMap.get(num);

        if (p != null)
            System.out.println(p);
        else
            System.out.println("Policy Not Found!");
    }

    // ---------------- EXPIRING SOON ----------------
    static void expiringSoon() {

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        System.out.println("\nPolicies Expiring in Next 30 Days:");

        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.entrySet()) {

            if (!entry.getKey().isAfter(limit)) {
                for (Policy p : entry.getValue()) {
                    System.out.println(p);
                }
            }
        }
    }

    // ---------------- BY POLICYHOLDER ----------------
    static void policiesByHolder(Scanner sc) {

        System.out.print("Enter Policyholder Name: ");
        String name = sc.next();

        System.out.println("\nPolicies of " + name + ":");

        boolean found = false;

        for (Policy p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found)
            System.out.println("No policies found.");
    }

    // ---------------- REMOVE EXPIRED ----------------
    static void removeExpired() {

        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<Integer, Policy>> it = hashMap.entrySet().iterator();

        while (it.hasNext()) {
            Policy p = it.next().getValue();
            if (p.expiryDate.isBefore(today)) {
                it.remove();
                linkedHashMap.remove(p.policyNumber);
            }
        }

        // clean TreeMap
        treeMap.entrySet().removeIf(e -> e.getKey().isBefore(today));

        System.out.println("Expired Policies Removed.");
    }

    // ---------------- SHOW ALL ----------------
    static void showAll() {

        System.out.println("\nPolicies (Insertion Order):");

        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }
}
