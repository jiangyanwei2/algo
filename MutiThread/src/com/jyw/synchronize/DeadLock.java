package com.jyw.synchronize;

public class DeadLock {
    private static Object locka = new Object();
    private static Object lockb = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (locka) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" get locka");
                        Thread.sleep(500);
                        synchronized (lockb) {
                            System.out.println(Thread.currentThread().getName()+" get lockb");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lockb) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" get lockb");
                        Thread.sleep(500);
                        synchronized (locka) {
                            System.out.println(Thread.currentThread().getName()+" get locka");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
