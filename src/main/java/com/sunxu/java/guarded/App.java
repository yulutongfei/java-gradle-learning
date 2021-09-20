package com.sunxu.java.guarded;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 17:23
 */
public class App {

    public static void main(String[] args) throws Exception {
        GuardedQueue guardedQueue = new GuardedQueue();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(() -> {
            Integer integer = guardedQueue.get();
            System.out.println(integer);
        });
        Thread.sleep(2000);
        executorService.execute(() -> guardedQueue.put(20));
        executorService.shutdown();
        executorService.awaitTermination(30, TimeUnit.SECONDS);
    }
}