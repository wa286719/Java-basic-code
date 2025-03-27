package com.itheima.test1;

public class Character {
    private String name;
    private int age;

    public Character() {
    }

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void check() {
        System.out.println("查看课程表");
    }
}
