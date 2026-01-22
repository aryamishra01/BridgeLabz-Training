package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicySystem {

	static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    static Set<Policy> treeSet = new TreeSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Insurance Policy System ======");
            System.out.println("1. Add Policy");
            System.out.println("2. Show All Policies");
            System.out.println("3. Policies Expiring in 30 Days");
            System.out.println("4. Policies by Coverage Type");
            System.out.println("5. Find Duplicate Policies");
            System.out.println("6. Performance Comparison");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addPolicy(sc);
                case 2 -> showAll();
                case 3 -> expiringSoon();
                case 4 -> filterByCoverage(sc);
                case 5 -> findDuplicates();
                case 6 -> performanceTest();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ADD POLICY
    static void addPolicy(Scanner sc) {

        System.out.print("Policy Number: ");
        int num = sc.nextInt();

        System.out.print("Holder Name: ");
        String name = sc.next();

        System.out.print("Coverage Type (Health/Auto/Home): ");
        String cover = sc.next();

        System.out.print("Premium Amount: ");
        double premium = sc.nextDouble();

        System.out.print("Expiry Date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        Policy p = new Policy(num, name, date, cover, premium);

        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);

        System.out.println("Policy Added!");
    }

    // SHOW ALL
    static void showAll() {

        System.out.println("\nHashSet (Unordered):");
        hashSet.forEach(System.out::println);

        System.out.println("\nLinkedHashSet (Insertion Order):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\nTreeSet (Sorted by Expiry):");
        treeSet.forEach(System.out::println);
    }

    // EXPIRING SOON
    static void expiringSoon() {

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        System.out.println("\nPolicies Expiring in Next 30 Days:");

        for (Policy p : hashSet) {
            if (!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // FILTER BY COVERAGE
    static void filterByCoverage(Scanner sc) {

        System.out.print("Enter Coverage Type: ");
        String type = sc.next();

        System.out.println("\nPolicies with " + type + " Coverage:");

        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // FIND DUPLICATES 
    static void findDuplicates() {

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Policy p : linkedHashSet) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }

        if (duplicates.isEmpty())
            System.out.println("No Duplicate Policy Numbers Found.");
        else
            System.out.println("Duplicate Policy Numbers: " + duplicates);
    }

    //PERFORMANCE TEST
    static void performanceTest() {

        Policy test = new Policy(9999, "Test", LocalDate.now(), "Health", 1000);

        System.out.println("\nPerformance Comparison (ns):");

        testSet(hashSet, test, "HashSet");
        testSet(linkedHashSet, test, "LinkedHashSet");
        testSet(treeSet, test, "TreeSet");
    }

    static void testSet(Set<Policy> set, Policy p, String name) {

        long start, end;

        start = System.nanoTime();
        set.add(p);
        end = System.nanoTime();
        System.out.println(name + " Add: " + (end - start));

        start = System.nanoTime();
        set.contains(p);
        end = System.nanoTime();
        System.out.println(name + " Search: " + (end - start));

        start = System.nanoTime();
        set.remove(p);
        end = System.nanoTime();
        System.out.println(name + " Remove: " + (end - start));
    }
}
