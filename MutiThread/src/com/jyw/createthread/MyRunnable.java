package com.jyw.createthread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("thread creat ...");
		
	}
	
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread creat ...");
				
			}
		});
		thread2.start();
	}
}
