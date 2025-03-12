package com.itheima.homework;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        键盘录入一个正整数
        定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
        在main方法中打印该数字是几位数
        演示格式如下:
        (1)演示一:
            请输入一个整数:1234
            控制台输出:1234是4位数字
        (2)演示二:
            请输入一个整数:34567
            控制台输出:34567是5位数字
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数");
        int number = 35894;
        int count = print(number);
        System.out.println(number + "是" + count + "位数");
    }
    //分析：
    //1.方法中接收一个形参num
    //2.定义变量count用于计数，count初始值为1
    //3.定义while循环，当num>0时
    //4.在循环内令num除以10，每除一次，count++
    //5.返回count
    public static int print(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
