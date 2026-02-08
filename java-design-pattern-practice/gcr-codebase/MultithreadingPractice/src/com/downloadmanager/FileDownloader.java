package com.downloadmanager;

class FileDownloader extends Thread {

	private String fileName;
	
	FileDownloader(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<=100; i += 10) {
				System.out.println("[" +Thread.currentThread().getName() +"] Downloading " +fileName +": " +i +"%");
				
				//random delay
				Thread.sleep((int) (Math.random() * 500));
			}
		}catch(InterruptedException e) {
			System.out.println("Download interrupted");
		}
	}
}
