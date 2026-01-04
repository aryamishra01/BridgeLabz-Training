package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

//This class represents a process node in the circular linked list
public class ProcessNode {

 int processId;        // Unique process ID
 int burstTime;        // Total burst time required
 int remainingTime;   // Remaining execution time
 int priority;         // Priority of the process

 int waitingTime;      // Waiting time of process
 int turnaroundTime;   // Turnaround time of process

 ProcessNode next;     // Reference to next process (circular)

 // Constructor to initialize process details
 public ProcessNode(int processId, int burstTime, int priority) {
     this.processId = processId;
     this.burstTime = burstTime;
     this.remainingTime = burstTime;
     this.priority = priority;
     this.waitingTime = 0;
     this.turnaroundTime = 0;
     this.next = null;
 }
}

