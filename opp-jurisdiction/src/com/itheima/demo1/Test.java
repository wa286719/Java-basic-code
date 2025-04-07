package com.itheima.demo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        //Animal类中name是private修饰时无法调用
        //System.out.println(a.name);
        //Animal类中name是默认不写修饰时可以调用
        System.out.println(a.name);
    }
}
