package com.linkedlist.circularlinkedlist.taskscheduler;

//This class manages tasks using a circular linked list
public class TaskScheduler {

	 private TaskNode head;      // First task in the list
	 private TaskNode current;   // Current task pointer
	
	 // Constructor initializes empty list
	 public TaskScheduler() {
	     head = null;
	     current = null;
	 }
	
	 // Add task at the beginning of the circular list
	 public void addAtBeginning(int id, String name, int priority, String date) {
	
	     TaskNode newTask = new TaskNode(id, name, priority, date);
	
	     // If list is empty
	     if (head == null) {
	         head = newTask;
	         newTask.next = newTask;
	         current = head;
	     } else {
	         TaskNode temp = head;
	
	         // Find last node
	         while (temp.next != head) {
	             temp = temp.next;
	         }
	
	         newTask.next = head;
	         temp.next = newTask;
	         head = newTask;
	     }
	
	     System.out.println("Task added at beginning");
	 }
	
	 // Add task at the end of the circular list
	 public void addAtEnd(int id, String name, int priority, String date) {
	
	     TaskNode newTask = new TaskNode(id, name, priority, date);
	
	     if (head == null) {
	         head = newTask;
	         newTask.next = newTask;
	         current = head;
	     } else {
	         TaskNode temp = head;
	
	         // Move to last node
	         while (temp.next != head) {
	             temp = temp.next;
	         }
	
	         temp.next = newTask;
	         newTask.next = head;
	     }
	
	     System.out.println("Task added at end");
	 }
	
	 // Add task at a specific position (1-based index)
	 public void addAtPosition(int position, int id, String name,
	                           int priority, String date) {
	
	     if (position <= 1) {
	         addAtBeginning(id, name, priority, date);
	         return;
	     }
	
	     TaskNode newTask = new TaskNode(id, name, priority, date);
	     TaskNode temp = head;
	     int count = 1;
	
	     // Traverse to the given position
	     while (count < position - 1 && temp.next != head) {
	         temp = temp.next;
	         count++;
	     }
	
	     newTask.next = temp.next;
	     temp.next = newTask;
	
	     System.out.println("Task added at position " + position);
	 }
	
	 // Remove task by Task ID
	 public void removeTask(int id) {
	
	     if (head == null) {
	         System.out.println("No tasks available");
	         return;
	     }
	
	     TaskNode currentNode = head;
	     TaskNode previous = null;
	
	     do {
	         if (currentNode.taskId == id) {
	
	             // If only one task exists
	             if (currentNode == head && currentNode.next == head) {
	                 head = null;
	                 current = null;
	             }
	             // If removing head task
	             else if (currentNode == head) {
	                 TaskNode temp = head;
	                 while (temp.next != head) {
	                     temp = temp.next;
	                 }
	                 head = head.next;
	                 temp.next = head;
	             }
	             // Removing middle or last task
	             else {
	                 previous.next = currentNode.next;
	             }
	
	             System.out.println("Task removed successfully");
	             return;
	         }
	
	         previous = currentNode;
	         currentNode = currentNode.next;
	
	     } while (currentNode != head);
	
	     System.out.println("Task ID not found");
	 }
	
	 // View current task and move to next task
	 public void viewNextTask() {
	
	     if (current == null) {
	         System.out.println("No tasks available");
	         return;
	     }
	
	     System.out.println("Current Task:");
	     System.out.println("Task ID: " + current.taskId);
	     System.out.println("Task Name: " + current.taskName);
	     System.out.println("Priority: " + current.priority);
	     System.out.println("Due Date: " + current.dueDate);
	
	     // Move to next task
	     current = current.next;
	 }
	
	 // Display all tasks starting from head
	 public void displayTasks() {
	
	     if (head == null) {
	         System.out.println("No tasks to display");
	         return;
	     }
	
	     TaskNode temp = head;
	     System.out.println("\nTask List:");
	
	     do {
	         System.out.println("Task ID: " + temp.taskId);
	         System.out.println("Task Name: " + temp.taskName);
	         System.out.println("Priority: " + temp.priority);
	         System.out.println("Due Date: " + temp.dueDate);
	         System.out.println("--------------------");
	
	         temp = temp.next;
	
	     } while (temp != head);
	 }
	
	 // Search task by priority
	 public void searchByPriority(int priority) {
	
	     if (head == null) {
	         System.out.println("No tasks available");
	         return;
	     }
	
	     TaskNode temp = head;
	     boolean found = false;
	
	     do {
	         if (temp.priority == priority) {
	             System.out.println("Task ID: " + temp.taskId);
	             System.out.println("Task Name: " + temp.taskName);
	             System.out.println("Due Date: " + temp.dueDate);
	             System.out.println("--------------------");
	             found = true;
	         }
	         temp = temp.next;
	
	     } while (temp != head);
	
	     if (!found) {
	         System.out.println("No tasks found with given priority");
	     }
	 }
}

