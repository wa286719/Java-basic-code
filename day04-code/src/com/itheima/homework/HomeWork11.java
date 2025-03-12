package com.itheima.homework;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        /*
          给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。
          将两数相除，要求不使用乘法、除法和 % 运算符。
          得到商和余数。
         */

        //分析：键盘录入两个数分别为被除数和除数
        //定义count用于统计减法次数
        //当被除数>=除数时，用被除数不断-除数，最终的被除数就是余数

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();
        int count = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商是：" + count);
        System.out.println("余数是：" + dividend);

    }
}
