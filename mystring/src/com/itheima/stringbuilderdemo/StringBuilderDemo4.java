package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //使用StringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();

        //2.使用StringBuilder里的reverse方法进行反转
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String result = sb.toString();

        //使用链式编程
        String Result = new StringBuilder().append(str).reverse().toString();

        //判断是否相等
        if (str.equals(Result)) {
            System.out.println("该字符串是对称字符串");
        } else {
            System.out.println("该字符串不是对称字符串");
        }
    }
}
