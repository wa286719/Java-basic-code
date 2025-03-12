package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        某影院售卖100张票，票号是1~100，奇数票坐左边，偶数票坐右边
         */

        //键盘录入票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号：");
        int number = sc.nextInt();

        //判断票号是否为1~100
        if(number < 1 || number > 100) {
            System.out.println("请输入正确票号");
        }else {
            //判断是奇数还是偶数
            if(number % 2 == 1) {
                System.out.println("坐在左侧");
            } else {
                System.out.println("坐在右侧");
            }
        }

    }
}
