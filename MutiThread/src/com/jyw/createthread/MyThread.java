package com.jyw.createthread;
//alt / 
//ctrl d �h��һ��
//ctrl /
//ctrl shift /
public class MyThread extends Thread  { 
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {

		System.out.println(this.name);
	}
	
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread("thread1");
		myThread.start();
		
		// �����ڲ���
		new Thread() {
			public void run() {
				
				System.out.println("thread2");
			}
		}.start();
	}

}
