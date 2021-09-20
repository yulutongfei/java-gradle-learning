package com.sunxu.java.onjava8;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/21 10:37
 */
// innerclasses/Parcel1.java
// Creating inner classes
public class Parcel1 {

    class Contents {

        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    // Using inner classes looks just like
    // using any other class, within Parcel1:
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");

    }
}
