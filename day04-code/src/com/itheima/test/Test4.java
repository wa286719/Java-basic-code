package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //键盘录入用户实际支付的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("用户实际支付：");
        int money = sc.nextInt();

        //判断是否支付成功
        if(money >= 600) {
            System.out.println("支付成功");
        }else {
            System.out.println("支付失败");
        }
    }
}
