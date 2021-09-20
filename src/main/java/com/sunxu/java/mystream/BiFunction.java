package com.sunxu.java.mystream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 08:34
 */
@FunctionalInterface
public interface BiFunction<R, T, U> {

    /**
     * 函数式接口
     * 类似于 z = F(x,y)
     * */
    R apply(T t, U u);
}
