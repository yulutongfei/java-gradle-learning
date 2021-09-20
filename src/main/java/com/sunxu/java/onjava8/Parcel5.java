package com.sunxu.java.onjava8;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/21 10:59
 */
// innerclasses/Parcel5.java
// Nesting a class within a method
//public class Parcel5 {
//    public Destination destination(String s) {
//        final class PDestination implements Destination {
//            private String label;
//
//            private PDestination(String whereTo) {
//                label = whereTo;
//            }
//
//            @Override
//            public String readLabel() { return label; }
//        }
//        return new PDestination(s);
//    }
//
//    public static void main(String[] args) {
//        Parcel5 p = new Parcel5();
//        Destination d = p.destination("Tasmania");
//    }
//}
//
//// innerclasses/Destination.java
//public interface Destination {
//    String readLabel();
//}