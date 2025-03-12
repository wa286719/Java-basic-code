package com.itheima.test.test1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        p.brand = "小米";
        p.price = 1999;

        //获取并打印手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();

        //创建新的对象
        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;

        p2.call();
        p2.playGame();
    }
}
