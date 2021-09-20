package com.sunxu.java.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/28 21:38
 */
public class JolSample {

    public static void main(String[] args) {
        ClassLayout layout = ClassLayout.parseInstance(new Object());
        System.out.println(layout.toPrintable());

        ClassLayout layout1 = ClassLayout.parseInstance(new int[]{});
        System.out.println(layout1.toPrintable());
    }
}
