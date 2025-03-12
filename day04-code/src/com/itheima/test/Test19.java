package com.itheima.test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        /*
        求商和余数：给定两个整数分别为被除数和余数
        不使用乘法、除法和%运算符得到商和余数
         */

        //分析：使用减法，用被除数不断去减除数，当最终结果<除数时，得到余数，
        //记录减法的次数，得到商

        //键盘录入被除数和除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();

        //定义count来记录被除数减除数的次数
        int count = 0;

        //使用循环来求解
        //dividend要>=divisor
        while (dividend >= divisor) {
            //用被除数减去除数
            dividend = dividend - divisor;
            //次数++
            count++;
        }
        System.out.println("商是：" + count);
        System.out.println("余数是：" + dividend);
    }
}
