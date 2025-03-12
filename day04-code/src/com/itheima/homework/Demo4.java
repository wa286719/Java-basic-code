package com.itheima.homework;//1.导包
import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        // 2.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 3.调用方法获取键盘录入的顾客类别和购物金额
        System.out.println("请输入顾客类别（0表示普通顾客，1表示会员顾客）：");
        int type = sc.nextInt();
        System.out.println("请输入购物金额：");
        int money = sc.nextInt();
        // 4.先判断顾客类别
        if (type == 0) {
            // 4.1.普通顾客，再判断购物金额
            if (money > 0 && money < 100) {
                System.out.println("您的应付金额为：" + money);
            } else if (money >= 100) {
                System.out.println("您的应付金额为：" + money * 0.9);
            } else {
                System.out.println("您输入的金额有误");
            }
        } else if (type == 1) {
            // 4.2.会员顾客，再判断购物金额
            if (money > 0 && money < 200) {
                System.out.println("您的应付金额为：" + money * 0.8);
            } else if (money >= 200) {
                System.out.println("您的应付金额为：" + money * 0.75);
            } else {
                System.out.println("您输入的金额有误");
            }
        } else {
            System.out.println("您输入的顾客类别有误");
        }
    }
}