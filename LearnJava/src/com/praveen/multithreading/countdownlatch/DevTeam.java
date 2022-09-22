package com.praveen.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DevTeam implements Runnable {

	private CountDownLatch countdown;
	
	public DevTeam(CountDownLatch countdown) {
		this.countdown = countdown;
	}

	@Override
	public void run() {
			
		System.out.println("Task started by Dev TEAM : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task finished by Dev TEAM : " + Thread.currentThread().getName());
		countdown.countDown();
	}

}
