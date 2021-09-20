package com.sunxu.java.stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 07:13
 */
public class StringDemo02 {

    public static void main(String[] args) {
        // 指向堆内存对象
        String s1 = new String("sunxu") + new String("sunxu");
        System.out.println(s1.hashCode());
        // 常量池有"11",返回指向常量池引用
        s1.intern();
        System.out.println(s1.hashCode());
        // 常量池有"11",返回指向常量池引用
        String s3 = "sunxusunxu";
        System.out.println(s1 == s3);
    }
}
