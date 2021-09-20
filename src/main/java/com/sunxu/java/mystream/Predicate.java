package com.sunxu.java.mystream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/22 08:36
 */
@FunctionalInterface
public interface Predicate <T>{

    /**
     * 函数式接口
     * @param item 迭代的每一项
     * @return true 满足条件
     *          false 不满足条件
     * */
    boolean satisfy(T item);
}
