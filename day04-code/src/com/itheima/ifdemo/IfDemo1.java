package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //键盘录入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = sc.nextInt();

        //对酒量进行判断
        if (wine > 2) {
            System.out.println("小伙子酒量不错");
        }
    }
}
