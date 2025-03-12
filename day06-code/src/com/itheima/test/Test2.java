package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //需求：定义一个方法，求圆的面积，将结果在方法中打印

        //分析：
        //1.这里需要一个带参数的方法getSquare
        //2.实参在main方法中通过键盘录入

        getArea(5);

    }

    public static void getArea(double radius) {
        double area = radius * radius * 3.14;
        System.out.println("圆的面积是：" + area);
    }
}
