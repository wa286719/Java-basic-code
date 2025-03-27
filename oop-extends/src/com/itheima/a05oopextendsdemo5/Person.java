package com.itheima.a05oopextendsdemo5;

public class Person {
    String name;
    int age;

    //父类中要有一个无参构造，子类才能继承父类
    //因为子类在继承时第一行默认有一个super()运行父类的无参构造来初始化父类
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
