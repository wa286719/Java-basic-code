package com.itheima.test.test3;

public class GirlFriend {
    private int age;


    public void method() {
        int age = 10;//如果没有定义局部变量，那只能输出成员变量，有无this都一样
        System.out.println(age);//此时输出10，即局部变量age
        System.out.println(this.age);//输出成员变量age
    }
}
