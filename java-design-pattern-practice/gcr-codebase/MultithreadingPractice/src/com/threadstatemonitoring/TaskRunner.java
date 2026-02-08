package com.threadstatemonitoring;

class TaskRunner extends Thread {

	 TaskRunner(String name) {
	     super(name); // Assign thread name
	 }

	 public void run() {
	     try {
	    	 
	         // RUNNABLE state (performing computation)
	         System.out.println(getName() + " is performing computation...");
	         
	         for (int i = 0; i < 5; i++) {
	            
	             Math.sqrt(i * 100);   // Simulate computation
	         }
	
	         // TIMED_WAITING state
	         System.out.println(getName() + " is going to sleep...");
	         Thread.sleep(2000);
	
	         // After sleep, thread finishes and becomes TERMINATED
	         System.out.println(getName() + " has completed work.");
	
	     } catch (InterruptedException e) {
	         System.out.println(getName() + " was interrupted.");
	     }
	 }
}
