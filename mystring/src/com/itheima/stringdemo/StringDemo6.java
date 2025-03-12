package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();

        //定义三个计数器分别来统计大写、小写以及数字个数
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        //遍历这个字符串，获得每一个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                //char类型的变量在参与计算或比较时，会自动将类型提升为int类型，再查询ASCII码表
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                //这里不能直接c >= 0 && c <= 9，这个是比较c和ASCII码表值为0~9的
                numCount++;
            }
        }
        System.out.println("小写字母个数为：" + smallCount);
        System.out.println("大写字母个数为：" + bigCount);
        System.out.println("数字个数为：" + numCount);
    }
}
