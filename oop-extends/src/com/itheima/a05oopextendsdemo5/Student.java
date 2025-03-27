package com.itheima.a05oopextendsdemo5;

public class Student extends Person {
    public Student() {}

    public Student(String name, int age) {
        //这个调用父类的有参构造来对子类进行有参构造
        super(name, age);
    }
}
