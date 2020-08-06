package com.jyw.synchronize;

import java.util.stream.Stream;

public class ProduceConsumer {
	private int i = 0;

    final private Object LOCK = new Object();

    private volatile boolean isProduced = false;

    public void produce() {
        synchronized (LOCK) {
            if (isProduced) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                i++;
                System.out.println(Thread.currentThread().getName() + i);
                LOCK.notifyAll();
                isProduced = true;
            }
        }
    }

    public void consume() {
        synchronized (LOCK) {
            if (isProduced) {
                System.out.println(Thread.currentThread().getName()  + i);
                LOCK.notifyAll();
                isProduced = false;
            } else {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ProduceConsumer pc = new ProduceConsumer();
                new Thread("p1->") {
                    @Override
                    public void run() {
                        while (true)
                            pc.produce();
                        
                    }
                    
                }.start();
                
                new Thread("p2->") {
                    @Override
                    public void run() {
                        while (true)
                            pc.produce();
                    }
                }.start();
       
                new Thread("c1->") {
                    @Override
                    public void run() {
                        while (true)
                            pc.consume();
                    }
                }.start();
                
                new Thread("c2->") {
                    @Override
                    public void run() {
                        while (true)
                            pc.consume();
                    }
                }.start();
                
       
    }

}
