package com.sunxu.java.stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 06:56
 */
public class StringDemo {

    public static void main(String[] args) {
        // 指向堆内存对象
        String s1 = new String("11");
        // 常量池有"11",返回指向常量池引用
        String s2 = s1.intern();
        // 常量池有"11",返回指向常量池引用
        String s3 = "11";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        // "2" 常量池, s4指向堆内存对象
        String s4 = new String("2") + new String("2");
        // "22"常量池没有,返回堆内存对象
        String s5 = s4.intern();
        // 常量池
        String s6 = "22";
        //
        System.out.println(s4 == s6);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
    }
}
