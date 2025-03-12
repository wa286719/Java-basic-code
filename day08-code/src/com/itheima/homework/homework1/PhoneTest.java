package com.itheima.homework.homework1;

public class PhoneTest {
    public static void main(String[] args) {
        /*
        定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
        调用对象的两个功能，打印效果如下：
        正在使用价格为3998元黑色的小米手机打电话....
        正在使用价格为3998元黑色的小米手机发短信....
         */

        Phone phone = new Phone();
        phone.setBrand("小米手机");
        String brand = phone.getBrand();
        phone.setPrice(3998);
        int price = phone.getPrice();
        phone.setColor("黑色");
        String color = phone.getColor();
        phone.call();
        phone.sendMessage();
    }
}
