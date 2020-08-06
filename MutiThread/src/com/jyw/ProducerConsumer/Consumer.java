package com.jyw.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    public BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {

            while(true) {

                Integer t = queue.take();
                System.out.println(Thread.currentThread().getName() + "comsume" + t);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }
}
