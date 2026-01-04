package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

//This class implements Round Robin scheduling using circular linked list
public class RoundRobinScheduler {

	 private ProcessNode last;   // Points to last node in circular list
	 private int timeQuantum;    // Fixed time quantum
	
	 // Constructor
	 public RoundRobinScheduler(int timeQuantum) {
	     this.last = null;
	     this.timeQuantum = timeQuantum;
	 }
	
	 // Add a new process at the end of the circular linked list
	 public void addProcess(int id, int burstTime, int priority) {
	
	     ProcessNode newProcess = new ProcessNode(id, burstTime, priority);
	
	     if (last == null) {
	         last = newProcess;
	         last.next = last;   // Circular link
	     } else {
	         newProcess.next = last.next;
	         last.next = newProcess;
	         last = newProcess;
	     }
	
	     System.out.println("Process added successfully");
	 }
	
	 // Display all processes in the circular queue
	 public void displayProcesses() {
	
	     if (last == null) {
	         System.out.println("No processes in the queue");
	         return;
	     }
	
	     ProcessNode temp = last.next;
	     System.out.println("\nCurrent Process Queue:");
	
	     do {
	         System.out.println(
	             "Process ID: " + temp.processId +
	             ", Remaining Time: " + temp.remainingTime +
	             ", Priority: " + temp.priority
	         );
	         temp = temp.next;
	     } while (temp != last.next);
	 }
	
	 // Execute round robin scheduling
	 public void executeProcesses() {
	
	     if (last == null) {
	         System.out.println("No processes to execute");
	         return;
	     }
	
	     int currentTime = 0;
	     int completed = 0;
	     int totalWaitingTime = 0;
	     int totalTurnaroundTime = 0;
	
	     int totalProcesses = countProcesses();
	
	     ProcessNode current = last.next;
	     ProcessNode prev = last;
	
	     while (completed < totalProcesses) {
	
	         if (current.remainingTime > 0) {
	
	             // Execute for time quantum or remaining time
	             int execTime = Math.min(timeQuantum, current.remainingTime);
	             current.remainingTime -= execTime;
	             currentTime += execTime;
	
	             // Increase waiting time of other processes
	             ProcessNode temp = last.next;
	             do {
	                 if (temp != current && temp.remainingTime > 0) {
	                     temp.waitingTime += execTime;
	                 }
	                 temp = temp.next;
	             } while (temp != last.next);
	
	             // If process finishes execution
	             if (current.remainingTime == 0) {
	
	                 current.turnaroundTime = currentTime;
	                 totalWaitingTime += current.waitingTime;
	                 totalTurnaroundTime += current.turnaroundTime;
	                 completed++;
	
	                 // Remove completed process from circular list
	                 if (current == last && current.next == last) {
	                     last = null;
	                 } else {
	                     prev.next = current.next;
	                     if (current == last) {
	                         last = prev;
	                     }
	                 }
	
	                 current = prev.next;
	                 displayProcesses();
	                 continue;
	             }
	         }
	
	         prev = current;
	         current = current.next;
	         displayProcesses();
	     }
	
	     // Display average times
	     System.out.println("\nAverage Waiting Time: " +
	             (double) totalWaitingTime / totalProcesses);
	
	     System.out.println("Average Turnaround Time: " +
	             (double) totalTurnaroundTime / totalProcesses);
	 }
	
	 // Count total processes in circular linked list
	 private int countProcesses() {
	
	     if (last == null) {
	         return 0;
	     }
	
	     int count = 0;
	     ProcessNode temp = last.next;
	
	     do {
	         count++;
	         temp = temp.next;
	     } while (temp != last.next);
	
	     return count;
	 }
}
