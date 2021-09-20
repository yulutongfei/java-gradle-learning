package com.sunxu.java.mystream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 08:34
 */
@FunctionalInterface
public interface Function<R,T> {

    /**
     * 函数式接口
     * 类似于 y = F(x)
     * */
    R apply(T t);
}
