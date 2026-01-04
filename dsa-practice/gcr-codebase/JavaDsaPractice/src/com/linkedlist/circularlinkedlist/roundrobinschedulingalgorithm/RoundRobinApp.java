package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

import java.util.Scanner;

//Main class to run Round Robin scheduling
public class RoundRobinApp {

	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	
	     System.out.print("Enter Time Quantum: ");
	     int timeQuantum = sc.nextInt();
	
	     RoundRobinScheduler scheduler =
	             new RoundRobinScheduler(timeQuantum);
	
	     int choice;
	
	     do {
	         System.out.println("\nRound Robin Scheduling Menu");
	         System.out.println("1. Add Process");
	         System.out.println("2. Display Processes");
	         System.out.println("3. Execute Scheduling");
	         System.out.println("4. Exit");
	         System.out.print("Enter your choice: ");
	
	         choice = sc.nextInt();
	
	         switch (choice) {
	
	             case 1:
	                 System.out.print("Enter Process ID: ");
	                 int pid = sc.nextInt();
	
	                 System.out.print("Enter Burst Time: ");
	                 int bt = sc.nextInt();
	
	                 System.out.print("Enter Priority: ");
	                 int pr = sc.nextInt();
	
	                 scheduler.addProcess(pid, bt, pr);
	                 break;
	
	             case 2:
	                 scheduler.displayProcesses();
	                 break;
	
	             case 3:
	                 scheduler.executeProcesses();
	                 break;
	
	             case 4:
	                 System.out.println("Exiting program");
	                 break;
	
	             default:
	                 System.out.println("Invalid choice");
	         }
	
	     } while (choice != 4);
	
	     sc.close();
	 }
}
