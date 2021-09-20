package com.sunxu.java.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 07:59
 */
public class StreamDemo {

    public static void main(String[] args) {
        Arrays.asList("sisi", "sunxu")
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}
