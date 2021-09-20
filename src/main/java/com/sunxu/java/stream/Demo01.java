package com.sunxu.java.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/21 20:24
 */
public class Demo01 {

    public static void main(String[] args) {
//        System.out.println(sequentialSum(1000));
        System.out.println(parallelSum(1000));
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }
}
