package com.itheima.homework;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        /*
        需求：给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。
         */

        //分析：键盘输入整数number
        //如何判断回文数？
        //将其按照个十百千万来拆解
        //定义gewei用于存放被拆解的个位
        //定义一个number1用于在while循环中不断除10
        //定义result来存放每次拆解的个位，每次*10再+新的个位

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        int result = 0;
        int gewei = 0;
        int number1 = number;

        while (number1 > 0) {
            gewei = number1 % 10;
            number1 /= 10;
            result = result * 10 + gewei;
        }
        System.out.println(result == number ? "是回文数" : "不是回文数");
    }
}
