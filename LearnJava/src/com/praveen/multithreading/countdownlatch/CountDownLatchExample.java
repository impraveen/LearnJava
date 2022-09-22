package com.praveen.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countdown = new CountDownLatch(2);
		
		Thread devTeamA = new Thread(new DevTeam(countdown), "Dev Team A");
		Thread devTeamB = new Thread(new DevTeam(countdown), "Dev Team B");
		
		devTeamA.start();
		devTeamB.start();
		
		countdown.await();
		
		Thread qaTeamA = new Thread(new QATeam(countdown), "QA Team A");
		
		qaTeamA.start();
		
	}

}
