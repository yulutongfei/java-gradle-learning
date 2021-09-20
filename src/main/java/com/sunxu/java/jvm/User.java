package com.sunxu.java.jvm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/31 23:54
 */
public class User {

    private long id;
    private String name;

    public User(long i, String name) {
        this.id = i;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
