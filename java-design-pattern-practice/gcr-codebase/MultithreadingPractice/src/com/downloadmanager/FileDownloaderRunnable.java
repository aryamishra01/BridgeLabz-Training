package com.downloadmanager;

class FileDownloaderRunnable implements Runnable{

	private String fileName;
	
	FileDownloaderRunnable(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		
		try {
			for(int i = 0; i<= 100; i = i+10) {
				System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + i + "%");

                Thread.sleep((int)(Math.random() * 500));
			}
		}catch(InterruptedException e) {
			System.out.println("Download interrupted");
		}
	}
}
