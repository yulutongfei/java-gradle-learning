package com.sunxu.java.deadlock;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 14:42
 */
public class DeadLock2 {

    public static void main(String[] args) {

        Account a = new Account("张三", 900);
        Account b = new Account("李四", 400);
        Thread threadA = new Thread(() -> {
            a.transfer(b,100);
        });

        Thread threadB = new Thread(() -> {
            b.transfer(a,200);
        });

        threadA.start();
        threadB.start();

    }
}
