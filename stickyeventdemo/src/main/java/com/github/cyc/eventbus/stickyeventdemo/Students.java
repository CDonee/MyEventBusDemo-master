package com.github.cyc.eventbus.stickyeventdemo;

/**
 * @author djc
 * @time 2018/4/26/026  23:57
 * @desc ${TODD}
 **/

public class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
