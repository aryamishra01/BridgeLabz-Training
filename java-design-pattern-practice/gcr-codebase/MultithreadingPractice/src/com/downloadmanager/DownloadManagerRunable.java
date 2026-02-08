package com.downloadmanager;

public class DownloadManagerRunable {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new FileDownloaderRunnable("Document.pdf"));
		Thread t2 = new Thread(new FileDownloaderRunnable("Image.jpg"));
        Thread t3 = new Thread(new FileDownloaderRunnable("Video.mp4"));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
	}

}
