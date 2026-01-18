package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeScreeningApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<JobRole> pipeline = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== RESUME SCREENING SYSTEM =====");
            System.out.println("1. Add Software Engineer Resume");
            System.out.println("2. Add Data Scientist Resume");
            System.out.println("3. Add Product Manager Resume");
            System.out.println("4. Run AI Screening Pipeline");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String sName = sc.nextLine();
                    System.out.print("Experience (years): ");
                    int sExp = sc.nextInt();
                    System.out.print("Coding Score: ");
                    int code = sc.nextInt();

                    Resume<SoftwareEngineer> seResume =
                            new Resume<>(new SoftwareEngineer(sName, sExp, code));

                    pipeline.add(seResume.getJobProfile());
                    break;

                case 2:
                    System.out.print("Name: ");
                    String dName = sc.nextLine();
                    System.out.print("Experience (years): ");
                    int dExp = sc.nextInt();
                    System.out.print("ML Score: ");
                    int ml = sc.nextInt();

                    Resume<DataScientist> dsResume =
                            new Resume<>(new DataScientist(dName, dExp, ml));

                    pipeline.add(dsResume.getJobProfile());
                    break;

                case 3:
                    System.out.print("Name: ");
                    String pName = sc.nextLine();
                    System.out.print("Experience (years): ");
                    int pExp = sc.nextInt();
                    System.out.print("Communication Score: ");
                    int comm = sc.nextInt();

                    Resume<ProductManager> pmResume =
                            new Resume<>(new ProductManager(pName, pExp, comm));

                    pipeline.add(pmResume.getJobProfile());
                    break;

                case 4:
                    ScreeningUtil.screenPipeline(pipeline); // wildcard method
                    break;

                case 0:
                    System.out.println("System Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}

