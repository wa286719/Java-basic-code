package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //定义商品总价和折扣
        int price = 1000;
        double discount = 1;
        //键盘录入会员级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级：");
        int grade = sc.nextInt();
        //判断级别，并给出相应的折扣
        if (grade >= 1 && grade <= 3) {
            if (grade == 1) {
                discount = 0.9;
            } else if (grade == 2) {
                discount = 0.8;
            } else if (grade == 3) {
                discount = 0.7;
            }
        } else {
            discount = 1;
        }
        //折扣 * 商品总价 输出实际支付金额
        System.out.println("实际支付金额为：" + price * discount);
    }
}
