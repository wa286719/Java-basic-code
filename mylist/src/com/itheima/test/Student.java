package com.itheima.test;

public class Student {
    //1.私有化成员变量
    //2.无参构造方法
    //3.有参构造方法
    //4.get和set
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
}
