package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //键盘输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.nextLine();//这个得到的字符串是new出来的
        //代码定义字符串
        String str2 = "abc";//这是直接赋值的

        //比较两个字符串是否相等
        System.out.println(str1 == str2);//false

        //结论：以后想要比较字符串的内容，就要用String里面的equals方法
    }
}
