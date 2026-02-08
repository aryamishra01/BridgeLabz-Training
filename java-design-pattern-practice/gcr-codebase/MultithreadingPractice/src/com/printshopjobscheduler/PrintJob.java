package com.printshopjobscheduler;

public class PrintJob implements Runnable {
	
    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= pages; i++) {
                System.out.println("Printing " + jobName +
                        " - Page " + i + " of " + pages +
                        " | Priority: " + priority);
                Thread.sleep(100);
            }
            System.out.println(jobName + " completed.\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}