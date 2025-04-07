package com.itheima.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("Frog",1);
        System.out.println(f.getAge() + f.getName());
        f.eat();
        f.swim();
    }
}
