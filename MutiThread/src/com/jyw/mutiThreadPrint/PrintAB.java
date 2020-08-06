package com.jyw.mutiThreadPrint;

public class PrintAB {
	private static int num;
	static class Task1 implements Runnable {
        private static Object monitor;
        
        public Task1(Object monitor) {
        	
        	this.monitor = monitor;
        }
        public volatile boolean flag = false;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (num < 10) {
				synchronized(monitor) {
					while(num % 2 == 0) {
						try {
							monitor.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName()+"A"+ "-" + num);
					num++;
					monitor.notify();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
	static class Task2 implements Runnable {
        private static Object monitor;
        public Task2(Object monitor) {
        	this.monitor = monitor;
        }
        public volatile boolean flag = false;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (num < 10) {
				synchronized(monitor) {
					while(num % 2 != 0) {
						try {
							monitor.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName()+"B"+"-"+num);
					num++;
					monitor.notify();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		num = 1;
		Object monitor = new Object();
		Task1 task1 = new Task1(monitor);
		Task2 task2 = new Task2(monitor);
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		thread1.start();
		thread2.start();
		
		
	}

}
