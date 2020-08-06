package com.jyw.threadend;

public class ThreadServiceTest {
	public static void main(String[] args) {
		ThreadService service = new ThreadService();
		service.execute(new Runnable() {
			public void run() {
				while(true) {
					
				}
			}
		});
		service.shutdown(10000);
	}
}
