package com.sunxu.java.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/6 12:26
 */
public class Solution1 {

    public static void main(String[] args) {
        LinkedHashMap<User, String> cow = new LinkedHashMap<>();
        cow.put(new User("2"), "2");
        cow.put(new User("1"), "1");

        for (Map.Entry<User, String> entry : cow.entrySet()) {
            System.out.println(entry);
        }
    }


}
class User {
    String name;

    public User(String name) {
        this.name = name;
    }

}