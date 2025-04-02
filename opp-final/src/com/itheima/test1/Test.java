package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        //使用final修饰的变量只能被赋值一次，即可认为是常量
        final int a = 10;
        System.out.println(a);
        //a使用final修饰，所以无法赋值第二次
        //a = 105;
    }
}

//使用final修饰的类无法被继承
//使用final修饰的方法无法被重写
final class Fu{
    public final void show(){
        System.out.println("无法被继承的父类方法");
    }
}

/*class Zi extends Fu{
    @Override
    public void show() {

    }
}*/
