package com.itheima.homework;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        某商场购物可以打折，具体规则如下：
    	普通顾客购不满100元不打折，满100元打9折；
    	会员购物不满200元打8折，满200元打7.5折；
    	不同打折规则不累加计算。

        请根据此优惠计划进行购物结算，键盘录入顾客的类别
        （0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
         */

        //分析：首先键盘录入顾客的类别,定义money表示顾客购物金额，定义payment表示最后支付金额
        //使用switch或if-else语句来对不同类别顾客进行计算

        //在以普通顾客身份计算最终金额时，购物金额为158
        //计算158*0.9时，由于计算机以二进制形式存储和处理浮点数，
        // 而某些十进制小数无法精确表示为二进制小数，所以出现结果为一长串小数
        Scanner sc = new Scanner(System.in);
        double payment ;
        System.out.println("请输入购物金额：");
        int money = sc.nextInt();
        System.out.println("请输入顾客类别：");
        int kind = sc.nextInt();
        if (kind == 1 || kind == 0) {
            switch (kind) {
                case 0:
                    if (money >= 100) {
                        payment = money * 0.9;
                        System.out.println(payment);
                    } else {
                        payment = money;
                        System.out.println(payment);
                    }
                    break;
                case 1:
                    if (money >= 200) {
                        payment = money * 0.75;
                        System.out.println(payment);
                    } else {
                        payment = money * 0.8;
                        System.out.println(payment);
                    }
            }
        } else {
            System.out.println("请输入正确类别");
        }
    }
}
