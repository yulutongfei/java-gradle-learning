package com.sunxu.java.onjava8;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/21 10:46
 */
// innerclasses/DotNew.java
// Creating an inner class directly using .new syntax
public class DotNew {

    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        DotNew.Inner dni2 = dn.new Inner();
    }
}