package com.github.cyc.eventbus.stickyeventdemo;

/**
 * Created by cyc on 2017/12/27.
 */

public class MessageEvent {
    private String message;
    private int age;
    private Students stu;

    public MessageEvent(String message, int age, Students stu) {
        this.message = message;
        this.age = age;
        this.stu = stu;
    }

    public MessageEvent(String message, int age) {
        this.message = message;
        this.age = age;
    }

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students getStu() {
        return stu;
    }

    public void setStu(Students stu) {
        this.stu = stu;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageEvent{" +
                "message='" + message + '\'' +
                ", age=" + age +
                ", stu=" + stu +
                '}';
    }
}
