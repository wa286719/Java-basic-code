package com.itheima.demo2;

import com.itheima.demo1.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        //Animal类中name是private或默认不写或protected修饰时在其他无关类中即使导包了也无法调用
        //但是public修饰时就可以调用了
        System.out.println(a.name);
    }
}
