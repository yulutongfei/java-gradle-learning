package com.sunxu.java.jvm;

import java.util.ArrayList;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/4/8 22:22
 */
public class HeapTest {

    byte[] a = new byte[1024 * 100];  //100KB

    public static void main(String[] args) throws InterruptedException {
        Integer i1 = new Integer(127);  //这种调用底层实际是执行的Integer.valueOf(127)，里面用到了IntegerCache对象池
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);
    }
}
