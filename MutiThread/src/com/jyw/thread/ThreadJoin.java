package com.jyw.thread;

import java.sql.SQLOutput;

public class ThreadJoin {
	static class Task1 implements Runnable {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " Sleep 3s...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " Down!");
		}
	}
public static void main(String[] args) throws InterruptedException {
	Task1 task = new Task1();
	Thread t1 = new Thread(task);
	t1.start();
	t1.join();
	System.out.println("excute main");
}
      
}
