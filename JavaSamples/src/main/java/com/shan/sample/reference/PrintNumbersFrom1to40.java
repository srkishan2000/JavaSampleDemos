package com.shan.sample.reference;

public class PrintNumbersFrom1to40 {

	public static void main(String[] args) {
		
		new ThreadTest().start();

	}

}

class ThreadTest extends Thread {
	public ThreadTest() {
		super();
	}
 
	public void run() {
		for (int i = 1; i < 5; i++) {
			if (i==1) {
				for (int j=1 ; j < 41 ; j++ ) {
					if(j%3 == 0) {
						System.out.println("Thread " + i + ": Friend of 3 : "+j);
					}
				}
			}
			
			if (i==2) {
				for (int j=1 ; j < 41 ; j++ ) {
					if(j%5 == 0) {
						System.out.println("Thread " + i + ": Friend of 5 : "+j);
					}
				}
			}
			
			if (i==3) {
				for (int j=1 ; j < 41 ; j++ ) {
					if(j%3 == 0 && j%5==0) {
						System.out.println("Thread " + i + ": Friend of 3 and 5 : "+j);
					}
				}
			}
			
			if (i==4) {
				for (int j=1 ; j < 41 ; j++ ) {
					if(!(j%3 == 0 && j%5==0)) {
						System.out.println("Thread " + i + ": Friend of None : "+j);
					}
				}
			}
				
			try {
				sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Test Finished .... ");
	}
}