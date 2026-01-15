package com.day10.birdsantuary;

import java.util.*;
import java.lang.reflect.*;

public class BirdSanctuaryApp {

    static ArrayList<Bird> birds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        showDeveloperInfo();

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1 Add Bird");
            System.out.println("2 Display All Birds");
            System.out.println("3 Display All Flying Birds");
            System.out.println("4 Display All Swimming Birds");
            System.out.println("5 Display Both Flying and Swimming Birds");
            System.out.println("6 Delete Bird by ID");
            System.out.println("7 Sanctuary Report");
            System.out.println("8 Exit");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: addBird(); break;
                case 2: displayAll(); break;
                case 3: displayFlying(); break;
                case 4: displaySwimming(); break;
                case 5: displayBoth(); break;
                case 6: deleteBird(); break;
                case 7: report(); break;
                case 8: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }

    static void addBird() {
        System.out.println("Enter bird type Eagle Duck Penguin Kiwi");
        String type = sc.nextLine();

        System.out.println("Enter bird name");
        String name = sc.nextLine();

        System.out.println("Enter bird id");
        String id = sc.nextLine();

        Bird b = null;

        if (type.equalsIgnoreCase("Eagle")) b = new Eagle(name, id);
        else if (type.equalsIgnoreCase("Duck")) b = new Duck(name, id);
        else if (type.equalsIgnoreCase("Penguin")) b = new Penguin(name, id);
        else if (type.equalsIgnoreCase("Kiwi")) b = new Kiwi(name, id);
        else {
            System.out.println("Invalid bird type");
            return;
        }

        birds.add(b);
        System.out.println("Bird added successfully");
    }

    static void displayAll() {
        for (Bird b : birds) {
            System.out.println(b.getId() + " " + b.getName() + " " + b.getSpecies() + " " + b.getAbilities());
            b.eat();
            if (b instanceof Flyable) ((Flyable) b).fly();
            if (b instanceof Swimmable) ((Swimmable) b).swim();
        }
    }

    static void displayFlying() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                System.out.println(b.getName() + " can fly");
                ((Flyable) b).fly();
            }
        }
    }

    static void displaySwimming() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                System.out.println(b.getName() + " can swim");
                ((Swimmable) b).swim();
            }
        }
    }

    static void displayBoth() {
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                System.out.println(b.getName() + " can fly and swim");
            }
        }
    }

    static void deleteBird() {
        System.out.println("Enter bird id to delete");
        String id = sc.nextLine();

        Iterator<Bird> it = birds.iterator();
        while (it.hasNext()) {
            Bird b = it.next();
            if (b.getId().equals(id)) {
                it.remove();
                System.out.println("Bird removed");
                return;
            }
        }
        System.out.println("Bird not found");
    }

    static void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("Flying birds " + fly);
        System.out.println("Swimming birds " + swim);
        System.out.println("Both abilities " + both);
        System.out.println("Neither ability " + neither);
    }

    static void showDeveloperInfo() {
        try {
            Class<?> c = Bird.class;
            if (c.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo d = c.getAnnotation(DeveloperInfo.class);
                System.out.println("System developed by " + d.name());
                System.out.println("Version " + d.version());
            }
        } catch (Exception e) {
            System.out.println("Annotation error");
        }
    }
}

