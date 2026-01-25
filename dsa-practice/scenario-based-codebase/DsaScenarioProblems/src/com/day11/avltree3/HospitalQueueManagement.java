package com.day11.avltree3;

import java.util.Scanner;

public class HospitalQueueManagement {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalAVL hospital = new HospitalAVL();

        while (true) {

            System.out.println("\nMenu");
            System.out.println("1 Register Patient");
            System.out.println("2 Discharge Patient");
            System.out.println("3 Display by Arrival Time");
            System.out.println("4 Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter check in time: ");
                    int time = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    hospital.registerPatient(time, name);
                    break;

                case 2:
                    System.out.print("Enter check in time to discharge: ");
                    int t = sc.nextInt();
                    hospital.dischargePatient(t);
                    break;

                case 3:
                    hospital.displayPatients();
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

