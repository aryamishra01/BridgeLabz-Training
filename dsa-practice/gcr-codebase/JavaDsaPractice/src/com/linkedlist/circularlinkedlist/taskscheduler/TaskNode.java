package com.linkedlist.circularlinkedlist.taskscheduler;

//This class represents a single task in the circular linked list
public class TaskNode {

	 int taskId;            // Unique task ID
	 String taskName;       // Name of the task
	 int priority;          // Priority of the task
	 String dueDate;        // Due date of the task
	
	 TaskNode next;         // Reference to next task (circular link)
	
	 // Constructor to initialize task details
	 public TaskNode(int taskId, String taskName, int priority, String dueDate) {
	     this.taskId = taskId;
	     this.taskName = taskName;
	     this.priority = priority;
	     this.dueDate = dueDate;
	     this.next = null;
	 }
}

