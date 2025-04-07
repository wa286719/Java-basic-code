package com.itheima.demo2;

import com.itheima.demo1.Animal;

public class Dog extends Animal {
    public void show() {
        //父类Animal中name是private和默认不写修饰时，name无法在其他包中的子类中调用
        //时protected或public修饰时可以调用
        System.out.println(name);
    }
}
