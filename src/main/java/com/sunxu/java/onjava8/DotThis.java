package com.sunxu.java.onjava8;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/21 10:44
 */
// innerclasses/DotThis.java
// Accessing the outer-class object
public class DotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {

        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
