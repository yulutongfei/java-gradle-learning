package com.sunxu.java.mystream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 08:37
 */
@FunctionalInterface
public interface Supplier<T> {

    /**
     * 提供初始值
     * @return 初始化的值
     * */
    T get();
}
