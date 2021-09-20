package com.sunxu.java.stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 07:22
 */
public class StringDemo03 {

    public static void main(String[] args) {
        String s1 = new String("2") + new String("2");
        s1.intern();
        String s2 = "22";
        System.out.println(s1 == s2);
    }
}
