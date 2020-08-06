package com.jyw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue<T> {
    private int capacity;
    private List<T> list = new ArrayList<>(capacity);
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();


    public void put(T t) throws InterruptedException {
        lock.lock();

        try{
            while (list.size() == capacity) {
                notFull.await();
            }
            list.add(t);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (list.size() == 0) {
                notEmpty.await();
            }
            T t = list.remove(list.size() - 1);
            notFull.signal();
            return t;
        } finally {
            lock.unlock();
        }
    }

}
