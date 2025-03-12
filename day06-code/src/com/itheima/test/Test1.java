package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果在方法中打印

        //分析：
        //1.这里需要一个带参数的方法，getPerimeter
        //2.实参是在main方法中通过键盘录入

        //1.从键盘录入长和宽
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入长：");
        int length = sc.nextInt();
        System.out.println("请输入宽：");
        int width = sc.nextInt();
        //2.调用方法
        getPerimeter(length, width);
    }

    public static void getPerimeter(int length, int width) {
        int perimeter = (length + width) * 2;
        System.out.println("长方形周长是：" + perimeter);
    }


}
