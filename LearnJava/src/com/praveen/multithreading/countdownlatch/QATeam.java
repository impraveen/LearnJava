package com.praveen.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class QATeam implements Runnable {

private CountDownLatch countdown;
	
	public QATeam(CountDownLatch countdown) {
		this.countdown = countdown;
	}

	@Override
	public void run() {
			
		System.out.println("Testing started by QA TEAM : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Testing finished by QA TEAM : " + Thread.currentThread().getName());
		countdown.countDown();
	}

}
