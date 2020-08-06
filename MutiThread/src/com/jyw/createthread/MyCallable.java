package com.jyw.createthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("º∆À„...");
		return 100;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable myCallable = new MyCallable();
		FutureTask<Integer> task = new FutureTask<>(myCallable);
		Thread thread = new Thread(task);
		thread.start();
		Integer result = task.get();
		System.out.println(result);
		
	}
	

}
