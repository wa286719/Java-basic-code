package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘录入身上有多少钱
        Scanner sc = new Scanner(System.in);
        System.out.println("身上有多少钱：");
        int money = sc.nextInt();

        //对钱进行判断
        if(money >= 100) {
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("吃沙县小吃");
        }
    }
}
