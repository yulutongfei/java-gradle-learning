package com.sunxu.java.deadlock;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 14:51
 */
public class Account {

    private final Allocator allocator;
    private final String name;
    private int balance;

    public Account(String name, int balance) {
        this.allocator = Allocator.getInstance();
        this.balance = balance;
        this.name = name;
    }

    public void transfer(Account target, int amt) {
        System.out.println(this.getName() + "向" + target.getName() + "转账" + "[" + amt + "]");
        while (!allocator.apply(this, target)) {
        }
        System.out.println(this.getName() + "获取2个账号的锁");
        try {
            synchronized (this) {
                System.out.println(this.getName() + " lock obj1");
                synchronized (target) {
                    System.out.println(this.getName() + " lock obj2");
                    if (this.balance > amt) {
                        this.balance -= amt;
                        target.balance += amt;
                        System.out.println(this.getName() + "现在余额" + "[" + this.balance + "]");
                    }
                }
            }
        } finally {
            allocator.clean(this, target);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name=" + name +
                ", balance=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }
}
