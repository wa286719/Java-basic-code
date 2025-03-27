package com.itheima.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        Husky h = new Husky();
        h.breakHome();
    }
}
