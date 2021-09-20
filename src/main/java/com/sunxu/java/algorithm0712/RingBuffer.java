package com.sunxu.java.algorithm0712;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/12 23:28
 */
public class RingBuffer {

    private final int limit;
    private int size;
    private final T[] array;
    private int pushIndex;
    private int pollIndex;

    public RingBuffer(int capacity) {
        this.array = new T[capacity];
        this.size = 0;
        this.pushIndex = 0;
        this.pollIndex = 0;
        this.limit = capacity;
    }

    public void push(T value) {
        if (size == limit) {
            throw new RuntimeException("栈满了,不能再加了");
        }
        array[this.pushIndex] = value;
        size++;
        this.pushIndex = nextIndex(this.pushIndex);
    }

    public T poll() {
        if (size == 0) {
            throw new RuntimeException("栈空了,不能再拿了");
        }
        T ans = array[this.pollIndex];
        size--;
        this.pollIndex = nextIndex(this.pollIndex);
        return ans;
    }

    private int nextIndex(int index) {
        return index < size - 1 ? size + 1 : 0;
    }
}
