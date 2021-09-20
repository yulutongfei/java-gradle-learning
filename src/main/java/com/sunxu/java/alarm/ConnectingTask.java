package com.sunxu.java.alarm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 19:38
 */
public class ConnectingTask implements Runnable {

    @Override
    public void run() {
        try {
            // 模拟10s的建立连接
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("alarm connected");
        onConnected();
    }

    private void onConnected() {

    }
}
