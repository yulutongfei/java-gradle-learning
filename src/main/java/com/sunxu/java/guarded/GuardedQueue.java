package com.sunxu.java.guarded;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 17:13
 */
public class GuardedQueue {

    private final Queue<Integer> sourceList;

    public GuardedQueue() {
        this.sourceList = new LinkedBlockingQueue<>();
    }

    public synchronized Integer get() {
        while (sourceList.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sourceList.peek();
    }

    public synchronized void put(Integer e) {
        sourceList.add(e);
        notifyAll();
    }
}
