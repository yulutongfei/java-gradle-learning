package com.sunxu.java.stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 08:23
 */
public class HashCodeDemo {

    public static void main(String[] args) {
        Student s1 = new Student("sunxu");
        Student s2 = new Student("sunxu");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
