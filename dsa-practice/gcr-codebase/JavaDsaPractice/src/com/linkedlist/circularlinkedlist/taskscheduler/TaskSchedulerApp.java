package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Scanner;

//Main class to run Task Scheduler
public class TaskSchedulerApp {

	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     TaskScheduler scheduler = new TaskScheduler();
	     int choice;
	
	     do {
	         System.out.println("\nTask Scheduler Menu");
	         System.out.println("1. Add Task at Beginning");
	         System.out.println("2. Add Task at End");
	         System.out.println("3. Add Task at Position");
	         System.out.println("4. Remove Task");
	         System.out.println("5. View Current Task and Move Next");
	         System.out.println("6. Display All Tasks");
	         System.out.println("7. Search Task by Priority");
	         System.out.println("8. Exit");
	         System.out.print("Enter your choice: ");
	
	         choice = sc.nextInt();
	         sc.nextLine();
	
	         switch (choice) {
	
	             case 1:
	                 System.out.print("Enter Task ID: ");
	                 int id1 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Task Name: ");
	                 String name1 = sc.nextLine();
	
	                 System.out.print("Enter Priority: ");
	                 int pr1 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Due Date: ");
	                 String date1 = sc.nextLine();
	
	                 scheduler.addAtBeginning(id1, name1, pr1, date1);
	                 break;
	
	             case 2:
	                 System.out.print("Enter Task ID: ");
	                 int id2 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Task Name: ");
	                 String name2 = sc.nextLine();
	
	                 System.out.print("Enter Priority: ");
	                 int pr2 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Due Date: ");
	                 String date2 = sc.nextLine();
	
	                 scheduler.addAtEnd(id2, name2, pr2, date2);
	                 break;
	
	             case 3:
	                 System.out.print("Enter Position: ");
	                 int pos = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Task ID: ");
	                 int id3 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Task Name: ");
	                 String name3 = sc.nextLine();
	
	                 System.out.print("Enter Priority: ");
	                 int pr3 = sc.nextInt();
	                 sc.nextLine();
	
	                 System.out.print("Enter Due Date: ");
	                 String date3 = sc.nextLine();
	
	                 scheduler.addAtPosition(pos, id3, name3, pr3, date3);
	                 break;
	
	             case 4:
	                 System.out.print("Enter Task ID to remove: ");
	                 scheduler.removeTask(sc.nextInt());
	                 break;
	
	             case 5:
	                 scheduler.viewNextTask();
	                 break;
	
	             case 6:
	                 scheduler.displayTasks();
	                 break;
	
	             case 7:
	                 System.out.print("Enter Priority to search: ");
	                 scheduler.searchByPriority(sc.nextInt());
	                 break;
	
	             case 8:
	                 System.out.println("Exiting Task Scheduler");
	                 break;
	
	             default:
	                 System.out.println("Invalid choice");
	         }
	
	     } while (choice != 8);
	
	     sc.close();
	 }
}

