package com.sunxu.java.deadlock;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 14:43
 */
public class Allocator {

    private List<Object> als = new ArrayList<>();

    private Allocator() {
    }

    public synchronized boolean apply(Object from, Object to) {
        if (als.contains(from) || als.contains(to)) {
            return false;
        } else {
            als.add(from);
            als.add(to);
        }
        return true;
    }

    public synchronized void clean(Object from, Object to) {
        als.remove(from);
        als.remove(to);
    }

    private static class Singleton {

        private static Allocator instance;

        static {
            instance = new Allocator();
        }
    }

    public static Allocator getInstance() {
        return Singleton.instance;
    }
}
