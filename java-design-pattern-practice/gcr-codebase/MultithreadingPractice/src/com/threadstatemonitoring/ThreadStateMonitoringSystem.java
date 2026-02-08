package com.threadstatemonitoring;

public class ThreadStateMonitoringSystem {

    public static void main(String[] args) throws InterruptedException {

        // Create worker threads (NEW state)
        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        Thread[] workers = {t1, t2};

        // Create monitor thread
        StateMonitor monitor = new StateMonitor(workers);

        // Start monitor first to capture NEW state
        monitor.start();

        // Small delay so monitor sees NEW state
        Thread.sleep(500);

        // Start worker threads
        t1.start();
        t2.start();

        // Wait for workers to finish
        t1.join();
        t2.join();

        // Wait for monitor to finish
        monitor.join();
    }
}

