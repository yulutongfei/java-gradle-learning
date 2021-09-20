package com.sunxu.java.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 16:56
 */
public class DeadLock3 {

    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread a = new Thread(new Lock1());
        Thread b = new Thread(new Lock2());
        a.start();
        b.start();
    }

    static class Lock1 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Lock1 running");
                    if (lock1.tryLock(1, TimeUnit.MILLISECONDS)) {
                        System.out.println("Lock1 lock obj1");
                        if (lock2.tryLock(1, TimeUnit.MILLISECONDS)) {
                            System.out.println("Lock1 lock obj2");
                        }
                    }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    static class Lock2 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Lock2 running");
                    if (lock2.tryLock(1, TimeUnit.MILLISECONDS)) {
                        System.out.println("Lock2 lock obj1");
                        if (lock1.tryLock(1, TimeUnit.MILLISECONDS)) {
                            System.out.println("Lock2 lock obj2");
                        }
                    }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
}
