package com.jyw.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    public BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                queue.put(i);
                System.out.println(Thread.currentThread().getName() + "put" + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
