package com.day2.callcenter;

import java.util.Scanner;

public class CustomerServiceMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerManagement cm = new CustomerManagement();

		System.out.println("Welcome to customer call service ");

		while (true) {
			System.out.println(
					"What you wanna do?\n1. Add Incomming Call\n2. Serve Next Customer\n3. Get Your Call Count\n4. Get Waiting VIP Count\n5. Get Waiting Normal Count\n6. Reset Monthly Data\n7. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Please Enter your name: ");
				String name = sc.nextLine();
				System.out.println("Enter yur customer ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter yur call time ");
				int time = sc.nextInt();
				sc.nextLine();

				System.out.println("Are you a VIP?\n1. Yess\n2. Noo");
				choice = sc.nextInt();
				sc.nextLine();

				boolean vip = true;
				if (choice == 2) {
					vip = false;
				}
				Customer c = new Customer(name, id, vip, time);
				cm.addIncomingCall(c);
			} else if (choice == 2) {
				Customer c = cm.serveNextCustomer();

				if (c == null) {
					System.out.println("No customers are waiting.");
				} else {
					System.out.println("Serving: " + c.name);
				}
			} else if (choice == 3) {
				System.out.println("Please Enter your name: ");
				String name = sc.nextLine();

				cm.getCallCount(name);
			} else if (choice == 4) {
				System.out.println(cm.getWaitingVIPCount() + " VIP customers are waiting");
			} else if (choice == 5) {
				System.out.println(cm.getWaitingNormalCount() + " Non VIP customers are waiting");
			}

			else if (choice == 6) {
				cm.resetMonthlyData();
				System.out.println("Customer queue has reseted!! ");
			} else if (choice == 7) {
				System.out.println("Thank You For Using!!");
				return;
			}
		}

	}
}
