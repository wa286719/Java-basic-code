package com.itheima.a02oopextendsdemo2;

public class Zi extends Fu{
    String name = "Zi";
    String game = "吃鸡";

    public void show() {
        //如何打印Zi?
        //直接打印name，就近原则
        System.out.println(name);
        //使用this关键字也可以，谁调用方法就把地址值传给this
        System.out.println(this.name);
        //如何打印Fu?
        //打印父类中同名的变量使用super关键字
        System.out.println(super.name);
        //如何打印喝茶?
        //因为成员变量和局部变量中都没有，即类和该方法中都没有hobby，所以到父类中寻找hobby
        System.out.println(hobby);//从局部位置往上找
        System.out.println(this.hobby);//从成员位置往上找
        System.out.println(super.hobby);//从父类成员位置往上找
        //如何打印吃鸡?
        System.out.println(game);
    }
}
